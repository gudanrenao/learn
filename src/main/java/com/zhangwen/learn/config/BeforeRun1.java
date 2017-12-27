package com.zhangwen.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 程序启动前第一个启动的bean
 *
 * @author zhangwen【zhangwenit@126.com】 2017/12/28 0:02
 **/
@Component
@Order(1)
public class BeforeRun1 implements CommandLineRunner {

  @Value("${test.random}")
  private String random;

  @Override
  public void run(String... strings) throws Exception {
    System.out.println("第一个运行的方法,random=" + random);
  }
}
