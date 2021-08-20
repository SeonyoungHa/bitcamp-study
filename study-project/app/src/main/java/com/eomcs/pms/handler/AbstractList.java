package com.eomcs.pms.handler;

import com.eomcs.util.List;

public abstract class AbstractList implements List {
  protected int size;

  @Override
  public int size() {
    return this.size;
  }
}
