package com.zhangwen.learn.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author zhangwen
 */
public interface LearnRepository extends Repository<Learn, Long>,JpaRepository<Learn, Long> {

    List<Learn> findAllByNameIsLike(String name);
}
