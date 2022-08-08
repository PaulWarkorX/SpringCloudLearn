package com.cloud.xframe.controller;

import com.cloud.xframe.entities.CommonResult;
import com.cloud.xframe.entities.Payment;
import com.cloud.xframe.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : zengh
 * @Date : 2022/8/4 0004 - 23:01
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*****插入结果：{},{}", payment,456789);

        if(result > 0)
        {
            return new CommonResult(200,String.format("创建数据成功！其端口号为 : %s", serverPort),payment);
        }else{
            return new CommonResult(300, String.format("创建数据失败！其端口号为 : %s", serverPort));
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null)
        {
            return new CommonResult(200,String.format("查询到对应记录,查询ID : %s,端口号为 : %s",id, serverPort), payment);
        }

        return new CommonResult(444,String.format("没有对应记录,查询ID:%s,端口号为 : %s" , id, serverPort),null);
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery()
    {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*****element: "+element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }
}
