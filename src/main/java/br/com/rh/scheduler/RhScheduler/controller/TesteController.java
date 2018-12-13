package br.com.rh.scheduler.RhScheduler.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TesteController {

    private static final Logger LOG = LoggerFactory.getLogger(TesteController.class);

    @Scheduled(fixedDelay = 10000l)
    public void teste() {
        LOG.info("teste");
    }
}
