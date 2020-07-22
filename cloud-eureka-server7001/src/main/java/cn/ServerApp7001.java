package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServerApp7001 {
    public static void main(String[] args) {
        SpringApplication.run(ServerApp7001.class,args);
    }
}
