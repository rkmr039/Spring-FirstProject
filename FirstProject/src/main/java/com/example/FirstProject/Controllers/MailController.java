package com.example.FirstProject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstProject.mailServices.MailSender;

@RestController
public class MailController {
	
	private MailSender mailSender;
	
	
	public MailController(@Qualifier("smtpMailSender") MailSender smtp) {
		this.mailSender = smtp;
	}


	@RequestMapping("/mail")
	public String mail() {
		mailSender.send("mail@example.com","A Test Mail from Spring","Body of th email");
		return "Mail Send";
	}
}
