package com.zhangwen.learn.controller;

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

    @GetMapping("index")
    public String index(Map<String, Object> result) {
        result.put("name", "zhang wen 123456");
        return "/index";
    }
}
