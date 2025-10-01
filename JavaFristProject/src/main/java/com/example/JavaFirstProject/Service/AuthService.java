package com.example.JavaFirstProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.webauthn.api.AuthenticatorResponse;
import org.springframework.stereotype.Service;

import com.example.JavaFirstProject.DTO.RegisterRequest;
import com.example.JavaFirstProject.Entity.User;
import com.example.JavaFirstProject.Repository.UserRepository;


@Service
public class AuthService<JWTUtil> {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private JWTUtil jwtUtil;
	
	
	 public AuthenticatorResponse register(RegisterRequest request) {
		 User user = new User();
		 user.setName(request.name);
		 user.setEmail(request.email);
		 user.setPassword(passwordEncoder.encode(request.password));
		 user.setRole(request.role);
		 userRepository.save(user);
		 
		 String token = jwtUtil.generateToken( user.getEmail(),user.getRole().name());
		 return  new AuthenticatorResponse(token,"User Registerd Successful");
		 
		  
	 }
	 
	 
	 public <LoginRequest> AuthenticatorResponse login(LoginRequest request) {
		 
		 User user = userRepository.findByEmail(request.email).orElseThrow(() -> new RuntimeException("User not found"));
		 
		 
		 if(!passwordEncoder.matches(request.password, user.getPassword()))
			 throw new RuntimeException("Invalid credentials");
		 
		 String token = jwtUtil.generateToken(user.getEmail(), user.getRole().name());
		 return new AuthResponse(token,"Login Successful");
		 
		 
	 