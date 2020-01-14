package com.klaukeenterprises.yoml;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class YomlTest {

  private YomlConfig config = YomlConfig.withDefaults();
  private Yoml yoml;

  @BeforeEach
  void setUp() {
    yoml = YomlFactory.create().createYoml(config);
  }

  @Test
  void testParseEmptyYaml() {
    String yaml = "";
    YomlNode rootNode = yoml.parse(yaml);
  }
}