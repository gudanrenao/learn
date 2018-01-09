package com.zhangwen.learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * 页面controller
 *
 * @author zhangwen at 2017-12-28 13:28
 **/
@Controller
public class HtmlController {

    private static final Logger logger = LoggerFactory.getLogger(HtmlController.class);

    @GetMapping("/index")
    public String index() {
        return "/index";
    }

    @GetMapping("/test")
    public String test(Map<String, Object> result) {
        result.put("name", "zha323");
        return "/test/index2";
    }
}
