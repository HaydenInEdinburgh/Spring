char08-spring-trans ->  做事务的环境项目

步骤：
    1、新建Maven项目
    2、加入Maven的依赖
        1）spring依赖
        2）mybatis依赖
        3）mysql驱动
        4）spring的事务依赖
        5）mybatis和spring集成的依赖
    3、创建实体类
        sale, goods
    4、创建Dao接口和Mapper文件
        saleDao and goodsDao
        saleDao.xml and GoodsDao.xml
    5、创建mybatis主配置文件
    6、创建Service接口和实现类，属性是saleDao, goodsDao
    7、创建spring的配置文件：声明mybatis的对象交给spring创建
        1）Data Source
        2）SqlSessionFactory
        3）Dao Object
        4）声明自定义的Service
    8、创建Test Class，获取Service对象，通过Service调用dao完成数据库的访问。

