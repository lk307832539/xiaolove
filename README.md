# 晓爱
和我家小妞妞一起努力学习而写的项目

---

### 为了简化学习过程去除多余的配置文件，将项目转换为Spring Boot 

2018/07/02

将过去多余的配置文件都注释，重新修改项目结构及内容

1、将webapp文件夹中的内容移动到resources中，删除webapp

2、删除jdbc.properties将配置文件移动到application.properties配置中

3、删除多余的配置文件

4、从mybatis转换为spring jpa

---
一些参考资料

> Spring Boot : https://spring.io/projects/spring-boot

集成了 SpringMVC 及一些其他的框架，减少了大量的配置文件，可以直接打成Jar包运行也可以打war包发布到Tomcat下运行

> Spring Data JPA : https://docs.spring.io/spring-data/jpa/docs/2.0.8.RELEASE/reference/html/  

默认使用 Hibernate ，简单的查询可以直接通过关键字来使用，也可以用@Query编写HQL来实现复杂的查询，添加 nativeQuery = true 来使用原生SQL