package com.cloud.xframe.controller;

/**
 * @author : zengh
 * @Date : 2022/8/5 0005 - 11:44
 */

import com.cloud.xframe.common.ReqURI;
import com.cloud.xframe.entities.CommonResult;
import com.cloud.xframe.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(ReqURI.PAYMENT_CREAT_URI,payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        return restTemplate.getForObject(ReqURI.PAYMENT_QUERY_URI + "/" + id, CommonResult.class);
    }
}
