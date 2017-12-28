package com.zhangwen.learn.controller;

import com.zhangwen.learn.domain.LearnRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据库连接
 *
 * @author zhangwen at 2017-12-28 15:32
 **/
@RestController
public class JdbcController {

    private final LearnRepository learnRepository;

    public JdbcController(LearnRepository learnRepository) {
        this.learnRepository = learnRepository;
    }

    @GetMapping("/learns")
    public Object learns() {
        return learnRepository.findAll();
    }
}
