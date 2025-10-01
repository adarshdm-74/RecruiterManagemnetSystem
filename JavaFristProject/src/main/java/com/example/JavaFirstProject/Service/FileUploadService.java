package com.example.JavaFirstProject.Service;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.JavaFirstProject.Security.CloudinaryConfig;

@Service
public class FileUploadService {
	
	@Autowired
	private CloudinaryConfig coludinaryConfig;
	
	@Autowired
	private CloudinaryConfig cloudinary;
	
	
	
	
	public String uploadFile(MultipartFile file, String folder) throws IOException{
		try {
			Map uploadFile= coludinaryConfig.cloudinary().cloudinary().upload(file.getBytes(),ObjectUtils.asMap("folder",folder));
			
			return (String)uploadFile.get("secure_url");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 return null;
	}

}
