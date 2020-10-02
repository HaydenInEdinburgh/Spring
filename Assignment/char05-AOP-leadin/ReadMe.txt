动态代理：   可以在程序的执行过程中，创建代理对象
           通过代理对象执行方法，给目标类的方法增加额外的功能（Function Augmentation)

JDK 动态代理实现步骤：
1.  创建目标类，someServiceImpl目标类，给他的doSome，doOther增加 输出时间&事务。
2.  创建InvocationHandler接口的实现类，在这个类实现给目标方法增加功能。
3.  使用JDK中 类Proxy，创建代理对象，实现创建代理对象的能力。
