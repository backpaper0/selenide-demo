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

## テスト実行

まずユーザーを登録し、プロジェクトを作成するテストケースを実行してください。

```
gradlew test --tests demo.test.InitializeTest -Pselenide.baseUrl=http://192.168.99.100:3000
```

次にチケットを登録するテストケースを実行してください。

```
gradlew test --tests demo.test.IssueTest -Pselenide.baseUrl=http://192.168.99.100:3000
```

## もう一度最初からテストする場合

次のコマンドでRedmineを動かしているDockerコンテナを停止・削除して、最初からやり直してください。

```
docker stop myredmine && docker rm myredmine
```

## License

Licensed under [The MIT License](https://opensource.org/licenses/MIT)
