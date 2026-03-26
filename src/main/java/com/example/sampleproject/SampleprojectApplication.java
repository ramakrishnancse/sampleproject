package com.example.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleprojectApplication.class, args);
    }

	@RequestMapping(path = "/hello",method = RequestMethod.GET)
	public String sayHello(){
		return "welcome to spring boot";
	}

}
