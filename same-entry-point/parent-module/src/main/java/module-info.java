module parent {
  requires transitive lombok;
  requires org.slf4j;
  requires org.reflections;
  exports ksaito.practice.sample.sameEntryPoint;
}
