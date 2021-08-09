package com.clubdesk.gxt.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    SpringContext.initialize(TestSpringConfig.class);
  }

  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {

  }
}
