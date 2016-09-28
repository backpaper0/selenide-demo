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

Selenideに渡すシステムプロパティを`.local.properties`という名前のファイルで設定することができます。
`.local.properties`の例は次の通りです。

```
selenide.baseUrl=http://192.168.99.100:3000
browser=ie
webdriver.ie.driver=IEDriverServer.exe
```

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

## License

Licensed under [The MIT License](https://opensource.org/licenses/MIT)
