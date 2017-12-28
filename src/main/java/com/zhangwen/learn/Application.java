package com.zhangwen.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 入口类
 *
 * @author zhangwen【zhangwenit@126.com】 2017/12/27 23:01
 **/
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);

        //设置banner
//    app.setBannerMode(Banner.Mode.OFF);

        app.run(args);
    }

}
