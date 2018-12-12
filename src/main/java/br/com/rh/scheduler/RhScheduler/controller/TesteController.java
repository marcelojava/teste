package br.com.rh.scheduler.RhScheduler.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TesteController {

    @Scheduled(fixedDelay = 10000l)
    public void teste() {
        System.out.println("teste");
    }
}
