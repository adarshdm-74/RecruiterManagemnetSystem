package com.example.JavaFirstProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaFirstProject.DTO.EmailRequest;
import com.example.JavaFirstProject.Service.EmailService;

@RestController
@RequestMapping("/api/notifify")
public class EmailController {
	
		@Autowired
		private EmailService emailService;
		
		
		@PostMapping("/send")
		public ResponseEntity<String>send(@RequestBody EmailRequest request){
			emailService.sendEmail(request);
			return ResponseEntity.ok("Email sent Successsfully");
		}
		

	}


