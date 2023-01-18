package com.lmsproject.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lmsproject.lms.model.user;
import com.lmsproject.lms.service.userservice;

@RestController
public class usercontroller {

	@Autowired
	private userservice userservice;
	
	@PostMapping("/registeruser")	
	public user reisteruser(@RequestBody user user) {
		return userservice.reisteruser(user);
	}
}
