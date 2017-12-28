package com.zhangwen.learn.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 测试实体类
 *
 * @author zhangwen at 2017-12-28 14:55
 **/
@Entity
public class Learn implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private int sex;

    @Column(nullable = false, length = 10)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
