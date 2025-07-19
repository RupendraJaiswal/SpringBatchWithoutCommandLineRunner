package com.devbuild.scheduler;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledJobLauncher {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job importUserJob;

    @Scheduled(fixedRate = 60000) // every 60 seconds
    public void runJob() {
        try {
        	System.out.println("Scheduler Started....");
        	JobParameters parameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();

			jobLauncher.run(importUserJob, parameters);
        	System.out.println("Scheduler Stoped....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
