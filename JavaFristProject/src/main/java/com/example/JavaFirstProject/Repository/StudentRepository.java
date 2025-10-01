package com.example.JavaFirstProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JavaFirstProject.Entity.Student;

public interface StudentRepository extends JpaRepository{
	Optional<Student>findByEmail(String email);
	Optional<Student>findById(Long id);
	

}
