char06 aop aspectJ

使用AOP：目的是给已经存在的一些类和方法，在不改变原来类的前提下，实现功能增强

使用AspectJ实现Aop的基本步骤：
    1. Create a new maven project
    2. Add dependencies
        2.1 Spring Dependencies
        2.2 AspectJ Dependencies
        2.3 Junit Dependencies
    3. Create new Object Classes:   Interface and its impl class
    4. 创建切面类： 普通类
       1）在类的上面加入@Aspect
       2）在类中定义方法，方法就是切面要执行的功能代码。
            在方法的上面加入AspectJ的通知注解，比如@before
            有需要指定切入点表达式execution()
    5. 创建Spring的配置文件：声明对象，把对象交给容器统一管理。
       声明对象你可以使用注解或者xml配置文件<bean>/
       1)声明目标对象
       2)声明切面类对象
       3)声明AspectJ框架中的自动代理生成器标签。
         自动代理生成器：用来完成代理对象的自动创建功能的。

    6. 创建测试类,从spring容器中获取目标对象（实际就是代理对象）。
       通过代理执行方法，实现AOP的功能增强。
