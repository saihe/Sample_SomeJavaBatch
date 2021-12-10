package ksaito.practice.sample.someJavaBatch.onlyEntryPoint.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
  SUCCESS(0),
  WARNING(1),
  ERROR(9);

  private final int code;
}
