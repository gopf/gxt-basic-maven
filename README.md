GXT Sample Maven Project
========================

Created with:

```
$ mvn archetype:generate \
-DarchetypeGroupId=com.sencha.gxt.archetypes \
-DarchetypeArtifactId=gxt-basic-support-41x-archetype \
-DarchetypeVersion=4.1.2 \
-DgroupId=com.clubdesk.gxt \
-DartifactId=basic \
-Dmodule=basic
```

Using JDK:

```
$ java --version
openjdk 11.0.11 2021-04-20
OpenJDK Runtime Environment AdoptOpenJDK-11.0.11+9 (build 11.0.11+9)
OpenJDK 64-Bit Server VM AdoptOpenJDK-11.0.11+9 (build 11.0.11+9, mixed mode)
```

Usage (Tomcat)
--------------

 * create WAR file with `mvn package`
 * `cp target/basic-1.0-SNAPSHOT.war ~/tools/apache-tomcat-9.0.37/webapps/app.war`
 * URL: `http://localhost:8080/app/`
 * **This is OK**

Usage (mvn gwt:run)
-------------------

 * start with `mvn gwt:run`
 * Application window is opened (Swing UI)
 * Open URL: http://127.0.0.1:8888/basic.html
 * **HTTP ERROR: 503 Problem accessing /basic.html. Reason: Service Unavailable**
    * https://support.sencha.com/#ticket-54254

Usage (IntelliJ SuperDev)
-----------------------------

 * Use the 'SuperDev' run configuration
   * module 'basic'
   * SuperDev mode with Javascript debugging
 * start in debug mode
* **HTTP ERROR: 503 Problem accessing /basic.html. Reason: Service Unavailable**
   * https://support.sencha.com/#ticket-54254

Errors from console:
```
   [WARN] Failed startup of context c.g.g.d.s.j.WebAppContextWithReload@4b54175a{/,file:/Users/chown/Library/Caches/JetBrains/IntelliJIdea2021.1/gwt/gxt-basic-maven.4dc7decc/basic.6e6c2285/run/www/,STARTING}{/Users/chown/Library/Caches/JetBrains/IntelliJIdea2021.1/gwt/gxt-basic-maven.4dc7decc/basic.6e6c2285/run/www}
MultiException[java.lang.RuntimeException: Error scanning file basicEntryPoint.class, java.lang.RuntimeException: Error scanning file basicEntryPoint$1.class]
	at org.eclipse.jetty.annotations.AnnotationConfiguration.scanForAnnotations(AnnotationConfiguration.java:536)
	at org.eclipse.jetty.annotations.AnnotationConfiguration.configure(AnnotationConfiguration.java:447)
	at org.eclipse.jetty.webapp.WebAppContext.configure(WebAppContext.java:479)
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1337)
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:741)
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:505)
	at com.google.gwt.dev.shell.jetty.JettyLauncher$WebAppContextWithReload.doStart(JettyLauncher.java:550)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
	at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
	at org.eclipse.jetty.server.handler.RequestLogHandler.doStart(RequestLogHandler.java:140)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
	at org.eclipse.jetty.server.Server.start(Server.java:387)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
	at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
	at org.eclipse.jetty.server.Server.doStart(Server.java:354)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
	at com.google.gwt.dev.shell.jetty.JettyLauncher.start(JettyLauncher.java:760)
	at com.google.gwt.dev.DevMode.doStartUpServer(DevMode.java:636)
	at com.google.gwt.dev.DevModeBase.startUp(DevModeBase.java:898)
	at com.google.gwt.dev.DevModeBase.run(DevModeBase.java:705)
	at com.google.gwt.dev.DevMode.main(DevMode.java:432)
Caused by: MultiException[java.lang.RuntimeException: Error scanning file basicEntryPoint.class, java.lang.RuntimeException: Error scanning file basicEntryPoint$1.class]
	at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:681)
	at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:688)
	at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:688)
	at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:688)
	at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:688)
	at org.eclipse.jetty.annotations.AnnotationParser.parse(AnnotationParser.java:824)
	at org.eclipse.jetty.annotations.AnnotationConfiguration$ParserTask.call(AnnotationConfiguration.java:163)
	at org.eclipse.jetty.annotations.AnnotationConfiguration$1.run(AnnotationConfiguration.java:548)
	at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
	at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
	at java.base/java.lang.Thread.run(Thread.java:834)
	Suppressed: java.lang.RuntimeException: Error scanning file basicEntryPoint$1.class
		at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:708)
		... 10 more
	Caused by: java.lang.UnsupportedOperationException: This feature requires ASM7
		at org.objectweb.asm.ClassVisitor.visitNestHost(ClassVisitor.java:150)
		at org.objectweb.asm.ClassReader.accept(ClassReader.java:550)
		at org.objectweb.asm.ClassReader.accept(ClassReader.java:400)
		at org.eclipse.jetty.annotations.AnnotationParser.scanClass(AnnotationParser.java:974)
		at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:702)
		... 10 more
Caused by: java.lang.RuntimeException: Error scanning file basicEntryPoint.class
	at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:708)
	... 10 more
Caused by: java.lang.UnsupportedOperationException: This feature requires ASM7
	at org.objectweb.asm.ClassVisitor.visitNestMember(ClassVisitor.java:236)
	at org.objectweb.asm.ClassReader.accept(ClassReader.java:660)
	at org.objectweb.asm.ClassReader.accept(ClassReader.java:400)
	at org.eclipse.jetty.annotations.AnnotationParser.scanClass(AnnotationParser.java:974)
	at org.eclipse.jetty.annotations.AnnotationParser.parseDir(AnnotationParser.java:702)
	... 10 more
```