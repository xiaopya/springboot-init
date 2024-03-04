package com.xiaopy.springbootinit.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cyl
 * @description: TODO 测试接口
 * @date: 2024/3/3 21:41
 */
@RestController
@RequestMapping("/get")
@Slf4j
public class TestController {

    @GetMapping
    public String getList(){
        return "你好";
    }
}
