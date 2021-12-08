# same-entry-point

どのモジュールでも、メインクラスは同じクラスにして、実際に実行するjarは別プロジェクトにしたい。

## イメージ

- parent-moduleにメインクラスがあり、Runnerインターフェースを実装したクラスをchild-moduleで実装する。
- 実行するjarはchild-moduleで作成する

```
.
├── first-child-module
│     ├── build.gradle
│     └── src
│         └── main
│               └── java
│                     ├── ksaito
│                     │     └── practice
│                     │         └── sample
│                     │             └── sameEntryPoint
│                     │                 └── first
│                     │                     └── Application.java
│                     └── module-info.java
└── parent-module
      ├── build.gradle
      └── src
          └── main
                └── java
                      ├── ksaito
                      │     └── practice
                      │         └── sample
                      │             └── sameEntryPoint
                      │                 ├── Executor.java
                      │                 └── Runner.java
                      └── module-info.java
```

## 実行方法

- 引数にパッケージを指定する
  - この時、 `ksaito.practice.sample.sameEntryPoint` はプレフィックスとして固定

```
例）first-child-moduleの場合
java -jar first-child-module-1.0-SNAPSHOT.jar first
```

- こうすることで `ksaito.practice.sample.sameEntryPoint.first.Application` が実行される
