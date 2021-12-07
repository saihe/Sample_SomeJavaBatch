package ksaito.practice.sample.sameEntryPoint.common;

import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReader;
import java.lang.module.ModuleReference;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;

import ksaito.practice.sample.sameEntryPoint.Runner;

public class Executor {
  public static void main(String[] args) {
//    try {
//      Runner runner = (Runner) Class.forName(new ModuleFinder().find(args[0]), "Application").getDeclaredConstructor().newInstance();
//      runner.run(args);
//    } catch (InstantiationException e) {
//      e.printStackTrace();
//    } catch (IllegalAccessException e) {
//      e.printStackTrace();
//    } catch (InvocationTargetException e) {
//      e.printStackTrace();
//    } catch (NoSuchMethodException e) {
//      e.printStackTrace();
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
        ModuleFinder
          .ofSystem()
          .findAll()
            .stream()
            .map(ModuleReference::descriptor)
            .map(ModuleDescriptor::name)
            .sorted()
            .forEach(System.out::println);
//        ModuleFinder.ofSystem().find("first").stream().forEach(System.out::println);
  }
}
