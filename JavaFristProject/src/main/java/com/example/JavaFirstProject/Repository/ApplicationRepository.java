package com.example.JavaFirstProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JavaFirstProject.Entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
	List<Application>findByStudentId(Long studentId);
	List<Application>findByJobId(Long JobId);

}
