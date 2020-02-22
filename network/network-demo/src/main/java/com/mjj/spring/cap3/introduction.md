```text


    Spring中bean的作用域

        @Scope注解
                prototype: 多实例，IOC容器启动时，IOC容器不会去调用方法创建对象，每次获取的时候才会调用方法创建对象
                singleton: 单实例（默认采用），IOC容器启动的时候会调用方法创建对象并放到IOC容器中，以后每次获取都直接
                           从容器中拿的同一个bean
                request: 主要针对web应用，递交一次请求创建一个实例
                session: 同一个session创建一个实例


        如果没有显示的使用@Scope注解，默认的bean是单实例的



        什么是bean的懒加载？

        @Lazy  针对单实例
        容器启动的时候不创建对象，仅当第一次使用获取bean的时候才创建初初始化



        @Conditional  条件注册bean

        FactoryBean  BeanFactory
         BeanFactory: 从我们容器中获取实例化后的bean


         个性化注册bean


         @Import注册Bean

          1. 手动添加组件到IOC容器
          2.


          @Bean 【导入第三方类或包的组件】


          @Import
            [快速给容器导入一个组件] @Bean有点简单
```
