# Sample_SomeJavaBatch

いくつかのJavaバッチの実装例をまとめたい。

## JDK

`Microsoft Build of OpenJDK 17`　を使用

## same-entry-point

各モジュールでビルドされたjarに、共通モジュールないのエントリーポイントを組み込む実装。
→各モジュールごとにビルドされたjarにメインクラスを指定して実行。

## only-entry-point

メインモジュールをエントリーポイントにして、サブモジュールをアダプトしていく実装。
→メインモジュールでビルドしたjarを実行。
