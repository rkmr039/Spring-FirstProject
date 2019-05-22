package com.example.FirstProject.mailServices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MailConfig {
	
	@Bean
	@Profile("dev")
	public MailSender mockMailSender() {
		return new MockMailSender();
		
	}
	@Bean
	//@Profile("prod")
	@Profile("!dev")
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
		
	}

}
