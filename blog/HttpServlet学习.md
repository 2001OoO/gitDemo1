# Idea注意事项

## Tomcat中文乱码

设置文件编码格式均为UTF-8

tomcat 配置添加-Dfile.encoding=UTF-8

帮助->编辑自定义VM选项添加 -Dfile.encoding=UTF-8

重启idea



## web.xml 4.0

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">



</web-app>
```

