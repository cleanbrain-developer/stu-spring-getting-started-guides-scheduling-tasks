package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.schedulingtasks.ScheduledTasks;

@SpringBootApplication
@EnableScheduling
public class StuSpringGettingStartedGuidesSchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuSpringGettingStartedGuidesSchedulingTasksApplication.class, args);
	}

}
