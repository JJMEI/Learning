```text


    Aware接口  用于获取容器资源

    AnnotationConfigApplicationContext

    ApplicationContextAware接口



    Spring底层对BeanPostProcessor的使用，包括bean的赋值，注入其他组件，生命周期注解功能等



    使用beans.xml赋值

    properties yml文件

    mysql.info.url=127.0.0.1
    mysql.info.username=mjj
    mysql.info.pwd=mjj

    yaml文件
    mysql
        info
            url:
            username:
            pwd:


            如何引用配置文件
            location

            @PropertySource(value="classpath:/test.properties")

```