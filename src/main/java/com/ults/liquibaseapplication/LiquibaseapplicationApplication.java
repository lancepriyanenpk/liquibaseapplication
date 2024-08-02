package com.ults.liquibaseapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LiquibaseapplicationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LiquibaseapplicationApplication.class, args);
        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        System.out.println("Active profiles: " + String.join(", ", activeProfiles));
    }

    public static void test(){
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers = null;
    }

}
