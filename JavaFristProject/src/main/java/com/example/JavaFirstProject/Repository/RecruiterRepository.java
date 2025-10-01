package com.example.JavaFirstProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JavaFirstProject.Entity.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
	Recruiter findByEmail(String email);
	Optional<Recruiter> findById(Long id);


}
