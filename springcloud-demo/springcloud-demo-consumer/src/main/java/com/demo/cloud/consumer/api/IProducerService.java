package com.demo.cloud.consumer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author NS
 * @date 2020/6/4 17:44
 */
@Component
@FeignClient(name = "product-server",path = "/product")
public interface IProducerService {

    @RequestMapping(value = "/product/getProduct")
    String getProducer();
}
