package com.klaukeenterprises.yoml;

import com.google.common.base.Preconditions;

public final class YomlComment {
  private final String content;

  private YomlComment(String content) {
    this.content = content;
  }

  public static YomlComment empty() {
    return of("");
  }

  public static YomlComment of(String content) {
    Preconditions.checkNotNull(content);
    return new YomlComment(content);
  }
}
