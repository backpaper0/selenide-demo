# Selenide demo

Redmineを利用したSelenideのデモです。

## 準備

Redmineを準備します。
Dockerを使うのが手軽です。

```
docker run -d -p 3000:3000 --name=myredmine redmine
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

## License

Licensed under [The MIT License](https://opensource.org/licenses/MIT)
