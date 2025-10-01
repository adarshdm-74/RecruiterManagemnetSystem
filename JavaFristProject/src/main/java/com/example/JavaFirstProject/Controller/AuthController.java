package com.example.JavaFirstProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.webauthn.api.AuthenticatorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaFirstProject.DTO.RegisterRequest;
import com.example.JavaFirstProject.Service.AuthService;

@RestController
	@RequestMapping("/api/auth")
	public class AuthController<LoginRequest> {
		
		@Autowired
		private AuthService authService;
		
		  @PostMapping("/register")
		    public ResponseEntity<AuthenticatorResponse>register(@RequestBody RegisterRequest request) {
		        return  ResponseEntity.ok(authService.register(request));
		    }

		    @PostMapping("/login")
		    public ResponseEntity<AuthenticatorResponse> login(@RequestBody LoginRequest request) {
		        return ResponseEntity.ok(authService.login(request));
		    }

	}



