package ksaito.practice.sample.sameEntryPoint.first;

import ksaito.practice.sample.sameEntryPoint.Runner;

public class Application implements Runner {
  public int run(String[] args) {
    System.out.println("first child executed");
    return 0;
  }
}
