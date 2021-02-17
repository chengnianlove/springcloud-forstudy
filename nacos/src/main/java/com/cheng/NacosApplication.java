package com.cheng;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.discovery.NacosDiscoveryClient;
import com.alibaba.cloud.nacos.discovery.NacosServiceDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 * @author create by Niancheng On 19:45 2021/2/15
 */
@SpringBootApplication
public class NacosApplication {
    public static void main(String[] args) {
        NacosDiscoveryProperties properties = new NacosDiscoveryProperties();
        NacosServiceDiscovery discovery = new NacosServiceDiscovery(properties);
        NacosDiscoveryClient client = new NacosDiscoveryClient(discovery);
        SpringApplication.run(NacosApplication.class);
    }
}
