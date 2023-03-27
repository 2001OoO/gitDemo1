## 引入spring6相关依赖

```xml
<!--        spring context依赖-->
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>6.0.7</version>
        </dependency>

<!--        junit依赖-->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.9.2</version>
        </dependency>

<!--        log4j2依赖-->
        <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.20.0</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-slf4j2-impl -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-slf4j2-impl</artifactId>
            <version>2.20.0</version>
            <scope>test</scope>
        </dependency>
```



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

