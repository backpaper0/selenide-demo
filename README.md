# Selenide demo

Redmineを利用したSelenideのデモです。

## 準備

Redmineを準備します。
Dockerを使うのが手軽です。

```
docker run -d -p 3000:3000 --name=myredmine redmine && docker logs -f myredmine
```

次のようなログが出力されたら起動完了です。
(`control + c`でログ表示を止めてください)

```
[2016-09-20 12:41:24] INFO  WEBrick::HTTPServer#start: pid=1 port=3000
```

Selenideに渡すシステムプロパティを`.local.properties`という名前のファイルで設定できるようにしています。
`.local.properties`の例は次の通りです。

```
selenide.baseUrl=http://localhost:3000
browser=chrome
webdriver.chrome.driver=chromedriver
```

`webdriver.chrome.driver`はChromeDriverへのパスです。
ChromeDriverは次のウェブサイトから入手してください。

* https://sites.google.com/a/chromium.org/chromedriver/downloads

## テスト実行

まずユーザーを登録し、プロジェクトを作成するテストケースを実行してください。

```
gradlew test --tests demo.test.InitializeTest
```

次にチケットを登録するテストケースを実行してください。

```
gradlew test --tests demo.test.IssueTest
```

チケットを登録するテストケースでは幾つかスクリーンショットも撮っています。
スクリーンショットは`build/reports/tests/`ディレクトリに保存されます。

登録したチケットにファイル(`README.md`)を添付するテストケースもあります。

```
gradlew test --tests demo.test.UploadFileTest
```

登録したチケットの削除ダイアログを利用した`confirm`のテストケースもあります。

削除しない場合は次のコマンドを実行してください。

```
gradlew test --tests demo.test.ConfirmTest.notDelete
```

削除しても良い場合は次のコマンドを実行してください。

```
gradlew test --tests demo.test.ConfirmTest.delete
```

## もう一度最初からテストする場合

次のコマンドでRedmineを動かしているDockerコンテナを停止・削除して、最初からやり直してください。

```
docker stop myredmine && docker rm myredmine
```

## Dockerを使う

例えば[selenium/standalone-chrome](https://hub.docker.com/r/selenium/standalone-chrome/)を使ってテストを実行してみましょう。

まず`selenium/standalone-chrome`に日本語フォントをインストールしたイメージを作ります。
`docker`ディレクトリで`docker build`を行ってください。

```
cd docker
docker build -t backpaper0/standalone-chrome .
```

イメージが出来たらコンテナを起動します。
`--link`オプションでRedmineのコンテナを参照できるようにしています。

```
docker run -d -p 4444:4444 --name=mychrome --link myredmine backpaper0/standalone-chrome && docker logs -f mychrome
```

次にSelenideの設定を行います。
先述の通り`.local.properties`でシステムプロパティを設定できます。

```
# Dockerコンテナ内からRedmineを参照するためのURL
selenide.baseUrl=http://myredmine:3000
browser=chrome
# Selenium ServerのURL
remote=http://localhost:4444/wd/hub
```

あとは`gradlew`でテストを実行するだけです。

## License

Licensed under [The MIT License](https://opensource.org/licenses/MIT)
