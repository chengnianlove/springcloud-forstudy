package com.cheng.consumer.controller;

import com.cheng.consumer.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by Niancheng On 2021/2/17 18:22
 */
@RestController
@RequestMapping
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/service")
    public String service(){
        String result = providerClient.service();
        return "consumer invoke: " + result;
    }
}
