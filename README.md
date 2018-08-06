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

#### JPA 实体关系 
2018/07/04
照搬：https://blog.csdn.net/cquzhengdayday/article/details/78930698

* 实体关系是指实体与实体之间的关系，从方向上分为单向关联和双向关联，从实体数量上分为一对一，一对多，多对多等，对于任何两个实体，都要从这个两个方面区分它们之间的关系。单向关联是一个实体中引用了另外一个实体，也即通过一个实体可以获取另一个实体对象的引用，双向关联是两个实体之间可以互相获取对方对象的引用。
    * 一对一 @OneToOne 
        * 学生证和身份证是一对一的关系。 
            * 单向关联 
                * 假设在学生实体中可以获取身份证对象的引用；反之，不能再身份证实体中获取学生对象的引用，则学生和身份证是一对一的单向关联关系
                * 这时候只需要在学生实体中的IDCrad_id加上@JoinColumn(name = “外键表字段名”)，以及@OneToOne(cascade=CascadeType.All)
                * @OneToOne 只能确定实体与实体之间的关系是一对一的关系，不能指定数据库表中的保存的关联字段，所以要结合@JoinColumn来指定关联字段
                * 在默认情况下，关联实体(IDCard)的主键一般是用来做外键的，但如果此时不想将关联实体的主键作为外键，需要设置@JoinColumn的referencedColumnName属性
            * 双向关联 
                * 需要在接受方的字段定义一个@OneToOne(mappedBy = “主动方一对一的属性名”)
            * 主键关联 
                * 既让两个实体对象具有相同的主键值，以表明它们之间的一一对应关系；而数据库不会有额外的字段来维护它们之间的关系，仅通过表的主键来关联，主键的值需要程序来显示维护。
                * 只要在@OneToOne的下面添加一个@PrimaryKeyJoinColumn
            * 总结 
                * 确定实体与实体之间的关系，如果是一对一关系 则使用@OneToOne
                * 确定表的结构的设计 
                    * 如果是外键关联，在关系维护段考虑默认的实体关系映射或@JoinColumn
                    * 如果表位于不同的数据中，可以采用主键关联，使用@PrimaryKeyJoinColumn
                * 确定实体关系的方向 
                    * 单向关系 在保存关联关系的实体中，使用@JoinColumn
                    * 双向关系 则在保存关联关系（也即存在外键）的实体中，要配合@JoinColumn；在没有保存关联关系的实体中，需使用mappedBy属性明确所关联的实体
                    * mappedBy用在双向关联中，mappedBy所在的实体为关系被维护端，而另一个实体为关系维护端（也即保存关联关系的一端）
    * 一对多 
        * 单向关联 
            * 使用@ManyToOne 比如一个学校可能有多个学生 ，那就可以在学生的schoolId字段加上@JoinColumn(name=”school_id”) @ManyToOne
        * 双向关联 
            * 在学校的students字段加一个 @OneToMany(mappedBy=”school”, cascade=CascadeType.ALL) 学生表中的SchoolId字段@JoinColumn(name = “”) @ManyToOne
            * option：指定级联方是否可以为空，默认为true,允许外键字段为空，若将其设置为false,则双方必须存在，也即外键字段不能为空
        * 表关联（双向） 
            * 在一对多或多对一的关联关系中，除了使用默认的外键关联外；还可以使用表关联，多的一方可以作为关系表的主键（唯一性约束）,而一的一方可以作为关系表另一个字段。
            * 在多的一方作为关系表的主键 name : 中间表 joinColumns:中间表中，指向关系维护端的外键； inverseJoinColumns:与joinColumns相似，指向中间表中被维护端的外键 
            
            ```java
            @ManyToOne 
            @JoinTable(name="SCHOOL_STUDENT", 
            joinColumns={ 
            @JoinColumn(name="student_id",referencedColumnName="id") //自方 
            }, 
            inverseJoinColumns={ 
            @JoinColumn(name="school_id",referencedColumnName="id") //一方 
            })
            ```
            
            * 在一的一方 @OneToMany(mappedBy=”school”)
        * 总结 
            * 确定实体与实体之间的关系，如果是一对多的关系，则使用@OneToMany；如果是多对一的关系使用@ManyToOne
            * 确认表结构的设计 
                * 如果是外键关联，在关系维护端考虑默认的实体关系映射或配合JoinColumn
                * 如果是表关联，则在关系维护端使用@JoinTable
            * 确定实体关系的方向 
                * 单向关联 一般情况下，多的一方为关系维护端，在保存关联关系实体中使用@JoinColumn或@JoinTable
                * 若为双向关联，则在关系维护端，配合@JoinColumn或@JoinTable；在关系呗维护端，要使用mappedBy属性明确所关联的实体
    * 多对多 
        * 单向关联 
            * 老师和学生就是一个多对多关系 ,在老师实体类中维护 

            ```java 
            @ManyToMany(fetch=FetchType.LAZY) 
            @JoinTable(name="TEACHER_STUDENT", 
            joinColumns={@JoinColumn(name="teacher_id")}, 
            inverseJoinColumns={@JoinColumn(name="student_id")}) 
            ```
            
        * 双向关联 
            * 在老师中如上维护，在学生中处理接受方 @ManyToMany(mappedBy=”students”,fetch=FetchType.LAZY)
        * 总结 
            * 单向关联在维护端使用@JoinTable
            * 双向关联在维护端使用@JoinTable 在关系被维护端，要使用mappedBy属性明确所关联
            * FetchType.EAGER:代表立即加载；
            * FetchType.LAZY:代表延迟加载。
---

#### Spring Boot Shiro处理静态资源的坑

2018/8/06

```java
//错误的示例
filterChainDefinitionMap.put("/static/**", "anon");

filterChainDefinitionMap.put("/bootstrap4/**", "anon");
filterChainDefinitionMap.put("/css/**", "anon");
filterChainDefinitionMap.put("/fontAwesome/**", "anon");
filterChainDefinitionMap.put("/images/**", "anon");
filterChainDefinitionMap.put("/js/**", "anon");
filterChainDefinitionMap.put("/MDB/**", "anon");
filterChainDefinitionMap.put("/upload/**", "anon");
filterChainDefinitionMap.put("/ueditor/**", "anon");
```

在Spring Boot 中直接对  /static/** 进行权限分配并不能对静态资源放行，需要对下面的每个文件夹下的内容进行权限分配

因为访问资源文件的时候，Url中内容是并不包括/static