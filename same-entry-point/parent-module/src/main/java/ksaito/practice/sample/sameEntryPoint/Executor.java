package ksaito.practice.sample.sameEntryPoint;

public class Executor {
  public static void main(String[] args) {
    try {
      Runner runner = (Runner) Class.forName("ksaito.practice.sample.sameEntryPoint." + args[0] + ".Application").getDeclaredConstructor().newInstance();
      runner.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
