package com.demo.cloud.product.controller;

import com.demo.cloud.entity.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NS
 * @date 2020/6/4 17:18
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/getProduct")
    public String getProduct(){
        Producer producer = new Producer("生产者1号",20,"add","123456789@163.com");
        return producer.toString();
    }
}
