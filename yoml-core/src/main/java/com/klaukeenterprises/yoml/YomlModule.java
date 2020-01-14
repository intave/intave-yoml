package com.klaukeenterprises.yoml;

import com.google.common.base.Preconditions;
import com.google.inject.AbstractModule;

public final class YomlModule extends AbstractModule {
  private final YomlConfig config;

  private YomlModule(YomlConfig config) {
    this.config = config;
  }

  @Override
  protected void configure() {
  }

  public static YomlModule withConfig(YomlConfig config) {
    Preconditions.checkNotNull(config);
    return new YomlModule(config);
  }
}
