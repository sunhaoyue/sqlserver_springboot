# sqlserver_springboot
标准依赖  
 <!-- pom.xml -->
>  <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.boot</groupId>
    <artifactId>testSpringBoot</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>testSpringBoot</name>
    <packaging>jar</packaging>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.5.9.RELEASE</version>
        <relativePath/>
    </parent>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        
        <!-- mybatis依赖 -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.1</version>
        </dependency>
        
        <!-- 引入thymelaf 则不需要引入web依赖，若不需要thymelaf则需要添加spring-boot-starter-web -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        
        <!-- mysql依赖 -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        
         <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-test</artifactId>
        </dependency>
    </dependencies>
    <build>
    <plugins>
        <!-- 要使生成的jar可运行，需要加入此插件 -->
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
</project>

二、资源加载视图图例  

1、注册视图效果
![Image text](https://github.com/sunhaoyue/sqlserver_springboot/blob/master/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202019-07-04%20%E4%B8%8B%E5%8D%882.05.21.png)

2、登录界面
![Image text](https://github.com/sunhaoyue/sqlserver_springboot/blob/master/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202019-07-04%20%E4%B8%8B%E5%8D%882.08.05.png)

3、错误显示页面
![Image text](https://github.com/sunhaoyue/sqlserver_springboot/blob/master/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202019-07-04%20%E4%B8%8B%E5%8D%882.08.17.png)
