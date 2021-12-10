package ksaito.practice.sample.someJavaBatch.onlyEntryPoint.writeConsole;

import java.util.Arrays;
import java.util.stream.Collectors;

import ksaito.practice.sample.someJavaBatch.onlyEntryPoint.common.ResultCode;
import ksaito.practice.sample.someJavaBatch.onlyEntryPoint.common.Runner;

public class WriteConsole implements Runner {
  @Override
  public ResultCode run(String[] args) {
    System.out.println("コンソール書き出しモジュールだよ。" + String.join(",", args));
    return ResultCode.SUCCESS;
  }
}
