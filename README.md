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

---

计划将Blog整合到晓爱中，整合数据库内容等信息，重新设计数据库内容


---

## 遇到一些所需要记录的问题

#### 实体类继承抽象类时候，使用注解开发

2018/07/02

使用@MappedSuperclass注解

---

#### MySQL 连接出现 Public Key Retrieval is not allowed

2018/07/03 

在jdbc url上添加

```
allowPublicKeyRetrieval=true
```

---

#### JPA OneToOne 

2018/07/04

以 user 和 userExt 为例

主表

@OneToOne(cascade = CascadeType.ALL)

@JoinColumn(name = "user_id")


从表

@OneToOne(mappedBy = "userExt")

> 当使用主键生成策略使用 GenerationType.AUTO 时候会按递增生成 ID ，使用全局数字生成器为每个新的实体对象生成主键。这些生成的值在数据库级别是唯一的,不会被回收,这些主键值被多个表共享。这样ID就不能相对应，修改为 GenerationType.IDENTITY 。

---