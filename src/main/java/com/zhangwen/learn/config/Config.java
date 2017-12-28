package com.zhangwen.learn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * 属性绑定
 *
 * @author zhangwen at 2017-12-28 10:01
 **/
@ConfigurationProperties(prefix="my")
@Configuration
@Validated
public class Config {

    private List<String> servers = new ArrayList<String>();

    @Valid
    private String myName;

    @Valid
    private String dbTest;

    public List<String> getServers() {
        return this.servers;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getDbTest() {
        return dbTest;
    }

    public void setDbTest(String dbTest) {
        this.dbTest = dbTest;
    }
}
