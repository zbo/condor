package com.zbo.cloud.condor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.lotus.ad4.cloud.condor"})
public class CondorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CondorApplication.class, args);
	}
}
