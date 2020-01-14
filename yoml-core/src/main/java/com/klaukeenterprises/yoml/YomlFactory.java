package com.klaukeenterprises.yoml;

import com.google.common.base.Preconditions;
import com.google.inject.Guice;
import com.google.inject.Injector;
import java.util.Objects;

public final class YomlFactory {
  private YomlFactory() {
  }

  public Yoml createYoml(YomlConfig config) {
    Preconditions.checkNotNull(config);
    Injector injector = createInjector(config);
    return injector.getInstance(Yoml.class);
  }

  private Injector createInjector(YomlConfig config) {
    YomlModule module = YomlModule.withConfig(config);
    return Guice.createInjector(module);
  }

  public static YomlFactory create() {
    return new YomlFactory();
  }
}
