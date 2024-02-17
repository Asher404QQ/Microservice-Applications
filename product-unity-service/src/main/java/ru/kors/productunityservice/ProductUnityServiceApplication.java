package ru.kors.productunityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("ru.kors.productunityservice")
@SpringBootApplication
public class ProductUnityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductUnityServiceApplication.class, args);
    }

}
