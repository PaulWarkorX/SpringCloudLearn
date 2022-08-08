package com.cloud.xframe.service;

import com.cloud.xframe.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author : zengh
 * @Date : 2022/8/4 0004 - 23:12
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
