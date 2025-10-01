package com.example.JavaFirstProject.Security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ObjectUtils;

public class CloudinaryConfig {
		
		
		@Value("${cloudinary.cloud_name}")
		private String cloudName;
		
		@Value("${cloudinary.api_key}")
		private String apiKey;
		
		@Value("${cloudinary.api_secret}")
		private String apiSecret;
		
		
		@Bean
		public CloudinaryConfig cloudinary() {
			return new CloudinaryConfig(ObjectUtils.asMap(
					"cloud_name",cloudName,
					"cloud_key",apiKey,
					"cloud_secret",apiSecret));
		}

}
