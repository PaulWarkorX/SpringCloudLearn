package com.cloud.xframe.dao;

import com.cloud.xframe.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : zengh
 * @Date : 2022/8/4 0004 - 23:02
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
