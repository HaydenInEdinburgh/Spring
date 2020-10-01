Char04-di-anno:

1. Motivation:
    Creating the java objects and editing their args by the annotation of
    spring instead of xml file.

2.  Steps:
    a.  insert dependencies.
    b.  create class, insert anno into class
    c.  create configuration file.
        announce the tags, name the position of the annos in your project.
    d.  use anno to create object, create container.

3.  Annotations
    a.  @Component      创建对象
    b.  @Value          简单类型的属性赋值
    c.  @Autowired      Spring框架中引用类型的赋值注解，支持byName, byType(default).
    d.  @Resource       JDK中的注解，使用自动注入给引用类型赋值
    e.  @Repository     创建Dao对象，用来访问数据库
    f.  @Service        创建Service对象，处理业务逻辑，可以有事务功能
    g.  @Controller     创建控制器对象，接受请求，显示处理结果

4.  How to use annotation?
    1. add the dependencies:    spring-context.
    2. add the annotation to the class
    3. add tag component scanner <context:component-scan base-package="package name">

