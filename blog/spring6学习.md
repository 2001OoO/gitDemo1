## log4j2.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration>
    <Appenders>
<!--        输出日志信息到控制台-->
        <console name="spring6log" target="SYSTEM_OUT">
            <patternLayout pattern="%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n" />
        </console>

        <!--            日志文件存储位置，不需要提前创建-->
        <file name="log" fileName="C:/Users/Niu Kai/Desktop/test/java/spring6/log/spring-first.log" append="false">
            <patternLayout pattern="%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n" />
        </file>

        <RollingFile name="RollingFile" fileName="C:/Users/Niu Kai/Desktop/test/java/spring6/log/app.log"
                     filePattern="log/$${date:yyyy-MM}/app-%d{MM-dd-yyyy}-%i.log.gz">
            <sizeBasedTriggeringPolicy size="50MB" />
            <!--                设置一个文件夹下最多几个文件，默认为7-->
            <defaultRolloverStrategy max="20" />
        </RollingFile>

    </Appenders>

    <Loggers>
        <Root level="DEBUG">
            <AppenderRef ref="spring6log"/>
            <AppenderRef ref="RollingFile"/>
            <AppenderRef ref="log"/>
        </Root>
    </Loggers>
</Configuration>
```



## 引入util命名空间

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       
       
       xmlns:util="http://www.springframework.org/schema/util"
       
       
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd

                           
       http://www.springframework.org/schema/util 
       http://www.springframework.org/schema/util/spring-util.xsd">

</beans>
```

第二部分和第四部分util结尾的



## 引入p命名空间

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       
       xmlns:p="http://www.springframework.org/schema/p"
       
       
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd

</beans>
```



## 引入context命名空间

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       
       
       xmlns:context="http://www.springframework.org/schema/context"

       
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
                           
                           
       http://www.springframework.org/schema/context 
       http://www.springframework.org/schema/context/spring-context.xsd">

</beans>
```



## 引入aop和context命名空间

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/aop 
       http://www.springframework.org/schema/aop/spring-aop.xsd
       http://www.springframework.org/schema/context 
       http://www.springframework.org/schema/context/spring-context.xsd">
    

</beans>
```





## jdbc.properties

```properties
jdbc.user=root
jdbc.password=123456
jdbc.url=jdbc:mysql://localhost:3306/demo1db?profileSQL=true
jdbc.driver=com.mysql.jdbc.Driver
```
