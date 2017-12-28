package com.zhangwen.learn.controller;

import com.zhangwen.learn.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 示例
 *
 * @author zhangwen【zhangwenit@126.com】 2017/12/27 22:29
 **/
@RestController
public class Example {

    private static Logger log = LoggerFactory.getLogger(Example.class);

    @Value("${test.value}")
    private String value;

    @Value("${test.value-dev}")
    private String valueDev;

    private final Config config;

    public Example(Config config) {
        this.config = config;
    }

    @RequestMapping("/")
    String home() {
        int i = 12;

        System.out.println(value);
        System.out.println(valueDev);
        System.out.println("myName=" + config.getMyName());
        System.out.println("dbTest=" + config.getDbTest());
        System.out.println(config.getServers());

        log.debug("debug 模式启动。。。");
        log.info("info 日志打印。。。");

        return "Hello World!11222333333345787909";


    }


}
