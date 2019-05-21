package com.example.FirstProject.mailServices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("smtp")
@Qualifier("smtpMailSender")
public class SmtpMailSender implements MailSender{
	
	private static Log log = LogFactory.getLog(SmtpMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		
		log.info("Sending SMTP mail "+ to);
		log.info("With subject "+ subject);
		log.info("any body "+ body);		
		
	}
	

}
