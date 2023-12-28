package com.CoTech.schedulingCronJob;

import com.CoTech.schedulingCronJob.service.DemoService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    private DemoService demoService;

    @Scheduled(cron = "0/10 * * * * *") // Cron expression for running every 10s
    public void execute() {
        System.out.println("using Cron syntax to execute after 0/10 * * * * * 10sec ");
        demoService.dummyMethod();
    }


    @Scheduled(fixedRate = 3000L) // executes in every 3s
    public void executeFixedRate3Sec() {
        System.out.println("using fixedRate = 3000L ");
        demoService.dummyMethod();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Scheduled(fixedDelay = 3000L) // executes in every 3+1s
    public void executeFixedDelay3Sec() {
        System.out.println("using fixedDelay = 3000L ");
        demoService.dummyMethod();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Scheduled(fixedDelay = 3000L, initialDelay = 3000L) // executes in every 3+1s after waiting 3 s for
    // start of application
    public void executeFixedDelay3SecInitialDelay3() {
        System.out.println("using fixedDelay  = 3000L + initial Delay = 3000L");
        demoService.dummyMethod();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}