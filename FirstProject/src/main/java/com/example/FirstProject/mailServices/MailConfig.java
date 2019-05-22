package com.example.FirstProject.mailServices;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MailConfig {
	
	@Bean
	@ConditionalOnProperty(name = "spring.mail.host", havingValue = "foo", matchIfMissing=true)
	public MailSender mockMailSender() {
		return new MockMailSender();
		
	}
	@Bean
	//@Profile("prod")
	@ConditionalOnProperty("spring.mail.host")
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
		
	}

}
