package com.eomcs.pms.handler;

import java.util.Map;

public class RequestDispatcher {

  Map<String,Command> commandMap;

  public RequestDispatcher(Map<String,Command> commandMap) {
    this.commandMap = commandMap;
  }

}
