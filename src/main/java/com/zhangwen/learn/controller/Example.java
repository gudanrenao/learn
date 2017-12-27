package com.zhangwen.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 示例
 *
 * @author zhangwen【zhangwenit@126.com】 2017/12/27 22:29
 **/
@RestController
public class Example {

  @RequestMapping("/")
  String home() {
    return "Hello World!11111";
  }

}
