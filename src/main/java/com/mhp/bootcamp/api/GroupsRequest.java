package com.mhp.bootcamp.api;

import java.util.List;
import lombok.Data;

@Data
public class GroupsRequest {
  private List<String> names;
  private int sizeOfGroups;
}
