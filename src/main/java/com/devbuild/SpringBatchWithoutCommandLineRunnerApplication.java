package com.devbuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class SpringBatchWithoutCommandLineRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchWithoutCommandLineRunnerApplication.class, args);
	}

}
