package com.example.PROJECT.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PROJECT.entity.HighSchool;
import com.example.PROJECT.serviceImpl.HighSchoolServiceImpl;
@RestController//controller+responsebody+accepts request
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/schoolmanagement.com")

public class HighSchoolController {

	@Autowired
	private HighSchoolServiceImpl schoolImpl;
	
	@PutMapping("/school/{schoolregno}")
	void updateSchoolDetails(@PathVariable("schoolregno") int regno, @RequestBody HighSchool newvlue ){
		 schoolImpl.updateSchoolDetails(regno, newvlue);
	}
	
	@DeleteMapping("/school/{schoolregno}")
	 public void deleteSchool(@PathVariable("schoolregno") int deleteId){
		schoolImpl.deleteSchoolByregno(deleteId);
	}
	
	@DeleteMapping
	 public void deleteAllSchools() {
		schoolImpl.deleteSchools();
	}
	
	@GetMapping("/school/{regno}")
	//@ResponseBody
	public HighSchool getSchoolRegno(@PathVariable ("regno")int schoolregno) {
		return schoolImpl.readSchoolFromDb(schoolregno);
	}
	
	@GetMapping("/school")
	//@ResponseBody
	public List<HighSchool> getAllSchoolsFromDb(){
		return schoolImpl.readAllSchoolFromDb();
	}
	
	@PostMapping("/school")
	public HighSchool addSchool(@RequestBody HighSchool schoolObj){
		return schoolImpl.addSchoolDetails(schoolObj);
}
}

