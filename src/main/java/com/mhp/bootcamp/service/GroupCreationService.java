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

    final Collection<List<String>> result = names.stream()
        .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / sizeOfGroups))
        .values();

    result.forEach(it -> groups.add(new Group(it)));

    return groups;
  }
}
