package com.mhp.bootcamp.controller;

import com.mhp.bootcamp.api.GroupsRequest;
import com.mhp.bootcamp.api.Group;
import com.mhp.bootcamp.service.GroupCreationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupCalculatorController {

  private final GroupCreationService groupCreationService;

  @Autowired
  public GroupCalculatorController(final GroupCreationService groupCreationService) {
    this.groupCreationService = groupCreationService;
  }

  @PostMapping(value = "/groups")
  public List<Group> createGroups(@RequestBody GroupsRequest groupsRequest) {
    return groupCreationService.separateGroups(groupsRequest.getNames(), groupsRequest.getSizeOfGroups());
  }
}
