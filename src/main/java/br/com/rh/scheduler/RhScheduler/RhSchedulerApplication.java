package br.com.rh.scheduler.RhScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RhSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhSchedulerApplication.class, args);
	}

}

