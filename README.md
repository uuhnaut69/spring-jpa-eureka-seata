# springcloud-eureka-seata-hystrix
Test Integrate spring cloud eureka server with seata and circuitbreaker hystrix

![Alt text](https://github.com/uuhnaut69/springcloud-eureka-seata-hystrix/blob/master/Untitled%20Diagram.png?raw=true "Flow")



1. In application.properties of the service add
```
spring.application.name= service name
server.port= service port
spring.datasource.url=jdbc:mysql://localhost:3306/schema-name?useSSL=false&serverTimezone=UTC
spring.datasource.username= username
spring.datasource.password= password
spring.cloud.alibaba.seata.tx-service-group= my_test_tx_group
logging.level.org.springframework.cloud.alibaba.seata.web=debug
logging.level.io.seata=debug
eureka.instance.hostname=127.0.0.1
eureka.instance.prefer-ip-address=true
eureka.client.serviceUrl.defaultZone=http://${eureka.instance.hostname}:8761/eureka/

```
2. In file.conf of the service add
```
vgroup_mapping.my_test_tx_group = "default"

```
3. Change type of registry in registry.conf of the service
```
#file 、nacos 、eureka、redis、zk
type = "eureka"

```
4. Seata server config files must config as the same.

5. Run Zipkin server via Docker
```
docker run -d -p 9411:9411 openzipkin/zipkin
```
