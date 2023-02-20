package com.tongji.volunteercertification.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description : 测试控制器
 * 注意: 必须以 certification 开头, 否则不会被路由转发
 * @author : Pikachudy
 * @date : 2023/2/20 17:50
 */
@RestController
@RequestMapping("/certification/test")
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello, volunteer certification!";
    }
}
