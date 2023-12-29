package com.example.PROJECT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.example.PROJECT.entity.TwilioConfig;
import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
@EnableConfigurationProperties
public class ProjectApplication {
	@Autowired 
	private TwilioConfig twilioConfig;
	
	@PostConstruct
	public void setup() {
		Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		System.out.println("Welcome to Higher Secondary School Management System");
	}
	

}

