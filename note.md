@toc
- 笔记：https://www.yuque.com/leifengyang/springboot3
- 代码：https://gitee.com/leifengyang/spring-boot-3

# 一、SpringBoot3-快速入门
## 1.1 简介
### 1.1.1 环境要求

| 环境&工具          | 版本（or later） |
| ------------------ | ---------------- |
| SpringBoot         | 3.0.5+           |
| IDEA               | 2021.2.1+        |
| Java               | 17+              |
| Maven              | 3.5+             |
| Tomcat             | 10.0+            |
| Servlet            | 5.0+             |
| GraalVM Community  | 22.3+            |
| Native Build Tools | 0.9.19+          |

### 1.1.2 SpringBoot是什么
SpringBoot 帮我们简单、快速地创建一个独立的、生产级别的 **Spring 应用（说明：SpringBoot底层是Spring）**

大多数 SpringBoot 应用只需要编写少量配置即可快速整合 Spring 平台以及第三方技术

**特性：**

- 快速创建独立 Spring 应用

  - SSM：导包、写配置、启动运行

- 直接嵌入Tomcat、Jetty or Undertow（无需部署 war 包）【Servlet容器】

  - linux  java tomcat mysql： war 放到 tomcat 的 webapps下
- jar： java环境；  java -jar

- **重点**：提供可选的starter，简化应用**整合**

  - **场景启动器**（starter）：web、json、邮件、oss（对象存储）、异步、定时任务、缓存...
- 导包一堆，控制好版本。
- 为每一种场景准备了一个依赖； **web-starter。mybatis-starter**

- **重点**：按需自动配置 Spring 以及 第三方库

  - 如果这些场景我要使用（生效）。这个场景的所有配置都会自动配置好。
- **约定大于配置**：每个场景都有很多默认配置。
- 自定义：配置文件中修改几项就可以

- 提供生产级特性：如 监控指标、健康检查、外部化配置等

  - 监控指标、健康检查（k8s）、外部化配置

- 无代码生成、无xml



总结：简化开发，简化配置，简化整合，简化部署，简化监控，简化运维。



### 1.1.3 特性小结

#### 1. 简化整合

导入相关的场景，拥有相关的功能。场景启动器

默认支持的所有场景：https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.build-systems.starters

- 官方提供的场景：命名为：`spring-boot-starter-*`
- 第三方提供场景：命名为：`*-spring-boot-starter`



场景一导入，万物皆就绪



#### 2. 简化开发

无需编写任何配置，直接开发业务



#### 3. 简化配置

`application.properties`：

- 集中式管理配置。只需要修改这个文件就行 。
- 配置基本都有默认值
- 能写的所有配置都在： https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties



#### 4. 简化部署

打包为可执行的jar包。

只需要linux服务器上有java环境。



#### 5. 简化运维

修改配置（直接在项目jar包同级目录放一个application.properties文件，即可更改配置，无需重新打包）、监控、健康检查。