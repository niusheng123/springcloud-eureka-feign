package com.demo.cloud.consumer.controller;

import com.demo.cloud.consumer.api.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NS
 * @date 2020/6/4 17:49
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Autowired
    private IProducerService iProducerService;

    @GetMapping("/getConsumer")
    public String getConsumer(){
        return iProducerService.getProducer();
    }
}
