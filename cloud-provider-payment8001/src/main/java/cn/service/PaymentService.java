package cn.service;

import cn.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentByid(@Param("id")Long id);
}