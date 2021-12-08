package ksaito.practice.sample.sameEntryPoint.second;

import ksaito.practice.sample.sameEntryPoint.Runner;

public class Application implements Runner {
  @Override
  public int run(String[] args) {
    System.out.println("second child executed");
    return 0;
  }
}
