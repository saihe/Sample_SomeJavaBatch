package ksaito.practice.sample.someJavaBatch.onlyEntryPoint.subModule;

import ksaito.practice.sample.someJavaBatch.onlyEntryPoint.common.ResultCode;
import ksaito.practice.sample.someJavaBatch.onlyEntryPoint.common.Runner;

public class SubModule implements Runner {
  @Override
  public ResultCode run(String[] args) {
    System.out.println("サブモジュールだよ。");
    return ResultCode.SUCCESS;
  }
}
