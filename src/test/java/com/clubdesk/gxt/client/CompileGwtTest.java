package com.clubdesk.gxt.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.clubdesk.gxt.basicDev";
  }

  public void testSandbox() {
    assertTrue(true);
  }
}
