package com.cheng.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by Niancheng On 2021/2/17 18:08
 */
@RestController
@RequestMapping
public class ProviderController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${server.port}")
    private String port;

    @GetMapping("/service")
    public String service(){
        logger.info(port + " :invoked");
        return "provider invoke";
    }
}
