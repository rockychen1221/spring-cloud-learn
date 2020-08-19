package com.datadriver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author rockychen
 * @version 1.0
 * @date 2020-08-18 18:02
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class NacosConfigController {

    private static Logger log = LoggerFactory.getLogger(NacosConfigController.class);

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get() {
        log.info("invoked  = " +useLocalCache);
        return useLocalCache;
    }

}
