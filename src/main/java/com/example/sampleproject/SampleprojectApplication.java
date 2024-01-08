package com.example.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SampleprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleprojectApplication.class, args);
    }

	@RequestMapping("/hello")
	public String sayHello(){
		return "welcome to spring boot";
	}

}
