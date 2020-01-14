package com.klaukeenterprises.yoml;

import com.google.common.base.Preconditions;

public final class Yoml {
  public YomlNode parse(String yaml) {
    Preconditions.checkNotNull(yaml);
    return YomlNode.of("default");
  }
}
