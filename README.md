#对"优雅的SSM框架"进行完善(页面分离+nginx负载均衡+tomcat集群)
- Maven
- Spring（IOC DI 声明式事务处理）
- SpringMVC（支持Restful风格）
- Hibernate Validate（参数校验）
- Mybatis（最少配置方案）
- Quartz时间调度
- Redis缓存（ProtoStuff序列化）
- **[Redis Sentinel主从高可用方案](http://wosyingjun.iteye.com/blog/2289593)**
- **[Druid（数据源配置 sql防注入 sql性能监控)](http://wosyingjun.iteye.com/blog/2306139)**
- 统一的异常处理
- **Tomcat集群（Redis共享Session）**
- **Nginx静态加载、负载均衡**
- **前后端分离（Html替代Jsp）**
- **nginx高可用方案（待完善）**  

###**架构图：**
![](http://i.imgur.com/Xtpg3od.png)

###**Start:**
- 创建数据库ssm 执行resources->sql-schema.sql文件  将数据库信息配置到jdbc.properties
- 修改redis.properties  自己环境的redis配置信息 (可以注释账号密码)

###**TODO**
- Active MQ
-