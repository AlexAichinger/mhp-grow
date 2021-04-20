package com.mhp.bootcamp.service;

import com.mhp.bootcamp.api.Group;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupCreationServiceTest {

  private final GroupCreationService sut = new GroupCreationService();

  @Test
  public void test_happy_1() {
    final List<String> names = Arrays.asList("alex", "bill", "lea", "torsti");
    final int groupSize = 1;
    List<Group> result = sut.separateGroups(names, groupSize);

    Assertions.assertEquals(4, result.size());
    Assertions.assertEquals("alex", result.get(0).getNames().get(0));
    Assertions.assertEquals("bill", result.get(1).getNames().get(0));
    Assertions.assertEquals("lea", result.get(2).getNames().get(0));
    Assertions.assertEquals("torsti", result.get(3).getNames().get(0));
  }

  @Test
  public void test_happy_2() {
    final List<String> names = Arrays.asList("alex", "bill", "lea", "torsti");
    final int groupSize = 2;
    List<Group> result = sut.separateGroups(names, groupSize);

    Assertions.assertEquals(2, result.size());
    Assertions.assertEquals("alex", result.get(0).getNames().get(0));
    Assertions.assertEquals("bill", result.get(0).getNames().get(1));
    Assertions.assertEquals("lea", result.get(1).getNames().get(0));
    Assertions.assertEquals("torsti", result.get(1).getNames().get(1));
  }

  @Test
  public void test_happy_3() {
    final List<String> names = Arrays.asList("alex", "bill", "lea", "torsti");
    final int groupSize = 3;

    List<Group> result = sut.separateGroups(names, groupSize);

    Assertions.assertEquals(2, result.size());
    Assertions.assertEquals("alex", result.get(0).getNames().get(0));
    Assertions.assertEquals("bill", result.get(0).getNames().get(1));
    Assertions.assertEquals("lea", result.get(0).getNames().get(2));
    Assertions.assertEquals("torsti", result.get(1).getNames().get(0));
  }

  @Test
  public void test_happy_4() {
    final List<String> names = Arrays.asList("alex", "bill", "lea", "torsti");
    final int groupSize = 4;

    List<Group> result = sut.separateGroups(names, groupSize);

    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals("alex", result.get(0).getNames().get(0));
    Assertions.assertEquals("bill", result.get(0).getNames().get(1));
    Assertions.assertEquals("lea", result.get(0).getNames().get(2));
    Assertions.assertEquals("torsti", result.get(0).getNames().get(3));
  }
}
