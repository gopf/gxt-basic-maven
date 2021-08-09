package com.clubdesk.gxt.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContext {

  private static AnnotationConfigApplicationContext context;

  public static void initialize(Class<?> configClass) {
    context = new AnnotationConfigApplicationContext();
    context.register(configClass);
    context.refresh();
  }

  public static ApplicationContext getContext() {
    return context;
  }
}
