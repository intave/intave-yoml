package com.klaukeenterprises.yoml;

import com.google.common.base.Preconditions;

public class YomlNode {
  private final YomlComment comment;
  private final String name;

  private YomlNode(YomlComment comment, String name) {
    this.comment = comment;
    this.name = name;
  }

  public static YomlNode of(String name) {
    Preconditions.checkNotNull(name);
    return of(YomlComment.empty(), name);
  }

  public static YomlNode of(YomlComment comment, String name) {
    Preconditions.checkNotNull(comment);
    Preconditions.checkNotNull(name);
    return new YomlNode(comment, name);
  }
}
