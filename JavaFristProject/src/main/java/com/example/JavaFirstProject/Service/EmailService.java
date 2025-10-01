package com.example.JavaFirstProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaFirstProject.DTO.EmailRequest;

import Enum.JavaMailSender;
import Enum.SimpleMailMessage;

@Service
  public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public String sendEmail(EmailRequest request) {
		try {
		SimpleMailMessage message =  new SimpleMailMessage(
				message.setTo(request.to),
		message.setSubject(request.subject),
		message.setText(request.body));
		
		mailSender.send(message);
		return "Email sent to"+request.to;
		}catch(Exception e) {
			return "Failed to send email"+e.getMessage();
		}
	}


}
