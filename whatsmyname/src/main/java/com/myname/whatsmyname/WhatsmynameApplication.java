package com.myname.whatsmyname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhatsmynameApplication {

    public static void main(String[] args) {
        System.out.println("my name is hwang coco");
        SpringApplication.run(WhatsmynameApplication.class, args);
    }

}
