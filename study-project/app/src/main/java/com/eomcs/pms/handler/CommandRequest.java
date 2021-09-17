package com.eomcs.pms.handler;

import java.util.HashMap;
import java.util.Map;

public class CommandRequest {


  // 커멘드 객체를 실행할 때 전달할 값을 담는 용도
  Map<String,Object> paramMap = new HashMap<>();

  public void setAttrubute (String name, Object value) {
    paramMap.put(name, value);
  }

  public Object getAttribute (String name) {
    return paramMap.get(name);
  }
}
