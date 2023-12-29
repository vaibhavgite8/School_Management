package com.example.PROJECT.repository;
	
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PROJECT.entity.HighSchool;



	@Repository //studentRepository
	public interface HighSchoolRepository extends JpaRepository<HighSchool, Integer> {

		List<HighSchool> findBySchoolName(String input);
	
	}
	

	
	

	
	
	
	

		

