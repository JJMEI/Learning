```text



    Bean的生命周期包含以下几个阶段
        创建
        初始化
        销毁

    开发者如何介入这几个阶段？
        1. 基于xml配置的阶段可以使用bean的 init-method 和 destroy-method 方法分别指定初始化和销毁方法
        2. 基于配置类的阶段可以使用@Bean注解中的initMethod和destroyMethod

        那么什么时候容器才可以执行初始化以及销毁方法呢？
            单实例模式下
                1. 容器可以正常调用 指定的初始化方法，容器关闭时可以正常调用销毁方法
            多实例模式下
                2. 容器启动时，因为没有创建bean 初始化方法不会被调用. 当容器初始化完成后，调用getBean，会触发
                   初始化方法，但是容器关闭时并不会调用指定的销毁方法。

                   多实例：容器只负责初始化，但不会管理bean，容器关闭时不会调用销毁方法



         让Bean实现InitializingBean 和 DisposableBean接口

            1. InitializingBean 定义初始化逻辑，实现其afterPropertiesSet()方法，当BeanFactory创建好对象，且
               将bean的所有属性设置好之后，会调用这个方法，相当于初始化方法。

            2. DisposableBean 定义销毁逻辑，实现destroy() 方法，当bean被销毁时，会把单实例bean进行销毁



          实现JSR250规范
           1. @PostConstruct  在Bean创建完成，且属于赋值完成后进行初始化，属于JDK规范注解

           2. @PreDestroy  在bean将被移除钱进行通知，在容器销毁之前进行清理工作




        后置处理器的方法，负责在初始化方法前后作用
        BeanPostProcessor bean的后置处理器，在bean初始化之前调用进行拦截，在bean的初始化之前进行一些操作
            1. postProcessorBeforeInitialization()   在初始化之前进行后置处理  在init-method方法之前
            2. postProcessorAfterInitialization()    在初始化之后进行后置处理工作 比如在 InitializingBean
               的afterPropertiesSet()方法之后



        因此整个bean的生命周期我们都能控制
















```