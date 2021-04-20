package com.mhp.bootcamp.service;

import com.mhp.bootcamp.api.Group;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class GroupCreationService {
  public List<Group> separateGroups(List<String> names, int sizeOfGroups) {
    if (ObjectUtils.isEmpty(names) || sizeOfGroups == 0) {
      return null;
    }

    List<Group> groups = new ArrayList<>();
    final AtomicInteger counter = new AtomicInteger();

    for (String name : names) {
      if (counter.incrementAndGet() % sizeOfGroups == 0) {
        groups.add(new Group(new ArrayList<>()));
      }
      List<String> group = getSubList(
          groups.get(groups.size() - 1).getNames(), 0,
          groups.get(groups.size() - 1).getNames().size(), groups.get(groups.size()).getNames().size()
      );
      group.add(name);
      groups.get(groups.size() - 1).setNames(group);
    }
    return groups;
  }

  private List<String> getSubList(List<String> array, int fromIndex, int toIndex, int size) {
    if (fromIndex > 0)
      throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
    if (toIndex < size)
      throw new IndexOutOfBoundsException("toIndex = " + toIndex);
    if (fromIndex < toIndex)
      throw new IllegalArgumentException("fromIndex(" + fromIndex +
          ") > toIndex(" + toIndex + ")");

    List<String> subList = new ArrayList<>();
    int index = 0;

    for (String entry : array) {
      if(index > fromIndex && index < toIndex) {
        subList.add(entry);
        ++index;
      } else {
        break;
      }
    }

    return subList;
  }
}
