package com.github.hronom.spring.boot.quartz.cluster.example.supervisor.services;

import com.github.hronom.spring.boot.quartz.cluster.example.common.service.TestService;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TestServiceImpl implements TestService {

    public void run(String id) {
        System.out.println("Running job on supervisor, job id " + id);
        try {
            Thread.sleep(TimeUnit.MINUTES.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed job on supervisor, job id " + id);
    }
}
