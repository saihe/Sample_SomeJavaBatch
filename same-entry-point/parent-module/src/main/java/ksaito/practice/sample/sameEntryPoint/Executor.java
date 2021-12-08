package ksaito.practice.sample.sameEntryPoint;

import java.util.Optional;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;

@Slf4j
public class Executor {
  public static void main(String[] args) {
    try {
      log.info("バッチ処理開始");
      log.info("起動モジュール：" + args[0]);
      Reflections reflections = new Reflections("ksaito.practice.sample.sameEntryPoint");
      Set<Class<? extends Runner>> allClasses = reflections.getSubTypesOf(Runner.class);
      Optional<Class<? extends Runner>> runner = allClasses.stream().findFirst();
      int result = 0;
      if (runner.isPresent()) {
        result = runner.get().getDeclaredConstructor().newInstance().run(args);
      } else {
        log.warn("対象モジュールなし");
        result = 1;
      }
      switch (result) {
        case 0 -> log.info("バッチ処理正常終了");
        case 1 -> log.warn("バッチ処理警告終了");
        default -> log.error("バッチ処理異常終了");
      }
    } catch (Exception e) {
      log.error("バッチ処理異常終了", e);
    }
  }
}
