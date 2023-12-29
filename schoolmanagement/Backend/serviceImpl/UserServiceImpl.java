package com.example.PROJECT.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PROJECT.entity.HighSchool;
import com.example.PROJECT.entity.User;
import com.example.PROJECT.repository.UserRepository;
import com.example.PROJECT.services.HighSchoolAction;

@Service

public class UserServiceImpl implements HighSchoolAction {

	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {

		this.userRepository.save(user);

	}

	public Optional<User> getUserByEmail(String email) {

		return this.userRepository.findByuserEmail(email);

	}

	@Override
	public List<HighSchool> readAllSchoolFromDb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HighSchool addSchoolDetails(HighSchool schoolObj) {
		// TODO Auto-generated method stub
		return null;
	}
}
