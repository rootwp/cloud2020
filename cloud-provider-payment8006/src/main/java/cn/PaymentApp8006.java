package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApp8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp8006.class,args);
    }
}
