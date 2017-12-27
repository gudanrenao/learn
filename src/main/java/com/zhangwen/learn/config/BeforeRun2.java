package com.zhangwen.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * 程序启动前第二个启动的bean
 *
 * @author zhangwen【zhangwenit@126.com】 2017/12/28 0:02
 **/
@Component
public class BeforeRun2 implements ApplicationRunner, Ordered {

  @Value("${test.value}")
  private String name;

  @Override
  public void run(ApplicationArguments applicationArguments) throws Exception {
    System.out.println("第二个运行的方法,name=" + name);
  }

  @Override
  public int getOrder() {
    return 0;
  }
}
