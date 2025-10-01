package com.example.JavaFirstProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaFirstProject.DTO.JobPostDTO;
import com.example.JavaFirstProject.Service.JobPostService;

@RestController
	@RequestMapping("/api/jobPojsts")
	public class JobPostController {

		@Autowired
		private JobPostService jobPostService;
		
		
		@PostMapping
		public ResponseEntity<JobPostDTO>createJob(@RequestBody JobPostDTO dto){
			return ResponseEntity.ok(jobPostService.postJob(dto));
		}
		@GetMapping("/recruiter")
		public ResponseEntity<List<JobPostDTO>>getByPostedEmail(@RequestParam String email){
			return ResponseEntity.ok(jobPostService.getByPostedByEmail(email));
		}
		@GetMapping("/jobTitle")
		public ResponseEntity<List<JobPostDTO>>geyByJobTitle(@RequestParam String jobTitle){
			return ResponseEntity.ok(jobPostService.getByJobTitle(jobTitle));
		}
		@GetMapping("/jobType")
		public ResponseEntity<List<JobPostDTO>>geByJobType(@RequestParam String jobType){
			return ResponseEntity.ok(jobPostService.getByJobType(jobType));
		
		}
		@GetMapping("/companyName")
		public ResponseEntity<List<JobPostDTO>>getByCompanyName(@RequestParam String companyName){
			return ResponseEntity.ok(jobPostService.getByCompanyName(companyName));
		}

}
