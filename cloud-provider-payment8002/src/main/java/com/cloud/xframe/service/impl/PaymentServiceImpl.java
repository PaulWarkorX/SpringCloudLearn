package com.cloud.xframe.service.impl;

import com.cloud.xframe.dao.PaymentDao;
import com.cloud.xframe.entities.Payment;
import com.cloud.xframe.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : zengh
 * @Date : 2022/8/4 0004 - 23:12
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
