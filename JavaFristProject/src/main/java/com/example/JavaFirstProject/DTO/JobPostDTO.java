package com.example.JavaFirstProject.DTO;

import java.util.Date;

public class JobPostDTO {
		
		public Long id;
		public String jobTitle;
		public String jobType;
		public String jobLocation;
		public String jobDescription;
		public String companyName;
		public String postedByEmail;
		public Date postedDate;
		
		
		public JobPostDTO() {}
		public JobPostDTO(Long id,String jobTitle,String jobDescription,String JobLocation,String jobType,String companyName,String postedByEmail,Date postedDSate) {
			this.id=id;
			this.jobTitle=jobTitle;
			this.jobType=jobType;
			this.jobDescription=jobDescription;
			this.jobLocation=jobLocation;
			this.companyName=companyName;
			this.postedByEmail=postedByEmail;
			this.postedDate=postedDate;
		}


}
