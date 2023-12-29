package com.example.PROJECT.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.PROJECT.entity.HighSchool;
import com.example.PROJECT.repository.HighSchoolRepository;

public interface HighSchoolAction 
{

	List<HighSchool> readAllSchoolFromDb();

	HighSchool addSchoolDetails(HighSchool schoolObj);

}
