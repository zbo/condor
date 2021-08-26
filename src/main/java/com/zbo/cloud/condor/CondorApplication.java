package com.lotus.ad4.cloud.condor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.lotus.ad4.cloud.condor"})
public class CondorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CondorApplication.class, args);
	}
}
