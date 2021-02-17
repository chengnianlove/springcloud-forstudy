package com.cheng.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author create by Niancheng On 2021/2/17 18:20
 */
@FeignClient("provider")
public interface ProviderClient {

    @GetMapping("/service")
    public String service();
}
