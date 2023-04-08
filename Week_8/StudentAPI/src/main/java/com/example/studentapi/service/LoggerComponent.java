package com.example.studentapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// @Component
public class LoggerComponent {
    private static final Logger logPrint = LoggerFactory.getLogger(LoggerComponent.class);

    @Scheduled(fixedRate = 10000)
    public void printLogInfo() {
        logPrint.info("Ujabb log uzenet (10 masodperc)");
    }
}
