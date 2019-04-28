package cn.tx;

import cn.tx.service.UserFelgnClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 *
 * 配置类
 */
@Configuration
public class UserConfig {

    // 把该方法创建后的对象存入到IOC容器中
    @Bean
    // 加入负载均衡策略，默认轮询策略，指定策略，自定义策略
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
