package com.example.FirstProject.mailServices;

public interface MailSender {
	
	void send(String to,  String subject, String body);
	

}
