# blx-ms-scaffold

## 概述
blx-ms-scaffold - 一个简易SpringBoot微服务脚手架

![](http://oh0ra6igz.bkt.clouddn.com/kntg2.jpg)

## 特性
- 使用SpringBoot系列框架
- Maven构建，Git版本控制
- 无本地库，复用外部Oracle数据库
- 使用Spring MVC提供REST服务
- 持久层使用Spring Data JPA/JDBC
- 数据源默认使用HikariCP
- 使用SpringFox自动生成API文档
- 提供一个swagger-ui可测试API界面
- logback分别打印-info与-error双日志
- hystrix不设置fallback方法，使用ExceptionHandler统一处理异常

## 项目依赖
- [spring-boot-starter-web](https://spring.io) - MVC集成
- [spring-boot-starter-test](https://spring.io) - 单元测试
- [spring-boot-starter-actuator](https://spring.io) - 应用监控
- [spring-boot-configuration-processor](https://spring.io) - 注解配置
- [spring-cloud-starter-hystrix](https://spring.io) - Hystrix集成
- [spring-boot-starter-jdbc](https://spring.io) - JdbcTemplate集成
- [SpringFox](http://springfox.github.io/springfox) - API文档生成

## 开发环境
- [Maven](https://maven.apache.org) - 项目构建工具
- [Nexus](http://www.sonatype.org/nexus) - Maven私服
- [Git](https://git-scm.com) - 分布式版本控制系统
- [IntelliJ IDEA](https://www.jetbrains.com/idea) - 可选，推荐的IDE

## DevOps
- [Gitlab](https://gitlab.com) - 版本库
- [Jenkins](https://jenkins.io) - 持续集成
- [SonarQube](https://www.sonarqube.org) - 代码质量管理
- [Jacoco](http://www.eclemma.org/jacoco) - 单元测试覆盖率检测
- [Docker](https://www.docker.com) - 应用容器
- [Marathon](https://mesosphere.github.io/marathon) - Docker集群管理
- [Swagger](http://swagger.io) - 服务契约
- [Hystrix](https://github.com/Netflix/Hystrix) - 服务熔断及降级
- [Kong](https://getkong.org) - 服务API管理
- [ELK](https://www.elastic.co/products) - 业务日志
- [Pinpoint](https://github.com/naver/pinpoint) - 调用链日志

## CHANGELOG
## [1.1.0] - 2016-06-23
### Added
- 使用spring-data-jpa替代spring-data-jdbc
- C2B同步

## [1.0.0] - 2016-06-20
### Added
- 按号码查询用户
- 按ID查询用户
- 按ITEM_ID查询资费
- 按USER_ID查询资费
- 按ITEM_ID修改资费
### Fixed
- 修复@JsonFormat时间显示问题
