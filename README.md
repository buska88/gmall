# Gmall电商项目



## 项目简介

Gmall电商项目是基于springboot+spring cloud+spring cloud alibaba+Mybaits plus实现的前后端分离的分布式电商项目，由前台商城系统和后台管理系统组成。前台商城系统实现了商品检索、登录认证、详情展示、购物车、订单结算、支付、秒杀等功能。后台管理系统实现了商品分类、属性管理、商品管理、仓库管理、商品上架等功能。项目采用微服务架构，分为商品服务、会员服务、优惠服务、订单服务、仓储服务、认证服务、购物车服务、网关服务、检索服务、秒杀服务等模块。



## 微服务模块



* gmall-common：公共模块，被其他微服务模块依赖，定义了常用工具类和常量，导入了公共的依赖
* gmall-auth-server：提供登录、注册、社交登录服务
* gmall-cart：购物车服务
* gmall-coupon：优惠券服务
* gmall-gateway：整个项目的网关
* gmall-member：会员服务
* gmall-order：订单服务，实现了验价，保存订单数据，锁库存功能
* gmall-product：实现了后台的商品管理与前台商品相关服务
* gmall-search：实现了商品的检索服务
* gmall-secskill：秒杀服务
* gmall-thirdparty：第三方服务，提供对象云存储(OSS)等功能
* gamll-ware：库存服务



## 技术选型

* SpringBoot：容器与mvc框架
* MyBatis-Plus：操作持久层
* SpringCloud：项目中使用了gateway作为统一网关，使用openfeign实现远程调用
* SpringCloudAlibaba：项目中使用nacos作为服务注册与发现中心
* Elasticsearch：搜索引擎，用于商品检索
* RabbitMQ：消息队列，项目中用于库存解锁，秒杀等功能
* Redis：缓存功能
* Docker：应用容器引擎
* Vue：后台管理系统的前端页面
* thymeleaf：模板引擎
* Nginx：搭建域名访问环境