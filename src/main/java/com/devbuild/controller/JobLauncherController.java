package com.devbuild.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobLauncherController {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job importUserJob;

	@GetMapping("/start")
	public ResponseEntity<String> launchJob() {
		try {

			JobParameters parameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();

			jobLauncher.run(importUserJob, parameters);
			return ResponseEntity.ok("Job started successfully.");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Job failed: " + e.getMessage());
		}
	}
}
