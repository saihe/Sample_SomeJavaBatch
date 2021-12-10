package ksaito.practice.sample.someJavaBatch.onlyEntryPoint.common;

import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BatchId {
  SUB_MODULE("sub-module"),
  WRITE_CONSOLE("write-console");
  private String id;

  public static BatchId getById(String id) {
    return Arrays.stream(BatchId.values())
      .filter(v -> v.id.equals(id))
      .findFirst()
      .orElseThrow();
  }
}
