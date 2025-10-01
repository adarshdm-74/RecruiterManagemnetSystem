package com.example.JavaFirstProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaFirstProject.Entity.PaidSubscription;

@Repository
	public interface PaidSubscriptionRepository extends JpaRepository<PaidSubscription,Long> {
		
		List<PaidSubscription>findByRecuiterId(Long recruiterId);
		List<PaidSubscription>findByEmployeeId(Long employeeId);
		List<PaidSubscription>finfByUserEmail(String userEmail);

	}


