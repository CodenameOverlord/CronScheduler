package com.CoTech.schedulingCronJob.service;

import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class DemoService {

    public void dummyMethod() {
        // Your task logic goes here
        System.out.println("Scheduled task executed at: " + new Date() +"run by thread "+ Thread.currentThread());
//        System.out.println("Scheduled task executed at: " + new Date());
        System.out.println("******************************");
    }


}