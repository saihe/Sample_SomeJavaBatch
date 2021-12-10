package ksaito.practice.sample.someJavaBatch.onlyEntryPoint;

import java.util.Arrays;
import java.util.stream.Collectors;

import ksaito.practice.sample.someJavaBatch.onlyEntryPoint.common.BatchId;
import ksaito.practice.sample.someJavaBatch.onlyEntryPoint.common.ResultCode;
import ksaito.practice.sample.someJavaBatch.onlyEntryPoint.subModule.SubModule;
import ksaito.practice.sample.someJavaBatch.onlyEntryPoint.writeConsole.WriteConsole;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
  public static void main(String[] args) {
    ResultCode result;

    try {
      log.info("バッチ処理開始");
      if (args.length == 0) {
        log.warn("引数が指定されていません。");
        result = ResultCode.WARNING;
      } else {
        log.info("起動引数：" + String.join(",", args));
        log.info("起動モジュール：" + args[0]);
        switch (BatchId.getById(args[0])) {
          case SUB_MODULE -> result = new SubModule().run(args);
          case WRITE_CONSOLE -> result = new WriteConsole().run(args);
          default -> result = ResultCode.WARNING;
        }
      }
      switch (result) {
        case SUCCESS -> log.info("バッチ処理正常終了");
        case WARNING -> log.info("バッチ処理警告終了");
        default -> log.info("バッチ処理異常終了");
      }
    } catch (Exception e) {
      log.error("バッチ処理異常終了", e);
      result = ResultCode.ERROR;
    }

    System.exit(result.getCode());
  }
}
