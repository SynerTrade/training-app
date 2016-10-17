package com.synertrade.training.configuration;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

/**
 * Created by tudorg on 10/17/2016.
 */
@SpringBootApplication(scanBasePackages = {"com.synertrade.training"})
@PropertySource("classpath:trainingapp.properties")
public class TrainingAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TrainingAppApplication.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
