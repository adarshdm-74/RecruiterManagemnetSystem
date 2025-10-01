package com.example.JavaFirstProject.Entity;

import java.util.Date;

import Enum.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name="applications")
	public class Application {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		
		private Long id;
		
		private Long studentId;
		private Long jobId;
		private String resumeURL;
		private Status status;
		private Date appliedDate;

		
		
		public Application() {}
		public Application(Long id,Long studentId,Long jobId,String resumeURL,Status status,Date appliedDate) {
			this.id=id;
			this.studentId=studentId;
			this.jobId=jobId;
			this.resumeURL=resumeURL;
			this.status= status;
			this.appliedDate=appliedDate;
		}
		
		public String getResumeURL() {
			return resumeURL;
		}
		public void setResumeURL(String resumeURL) {
			this.resumeURL = resumeURL;
		}
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getStudentId() {
			return studentId;
		}

		public void setStudentId(Long studentId) {
			this.studentId = studentId;
		}

		public Long getJobId() {
			return jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public Date getAppliedDate() {
			return appliedDate;
		}

		public void setAppliedDate(Date appliedDate) {
			this.appliedDate = appliedDate;
		}
		

}
