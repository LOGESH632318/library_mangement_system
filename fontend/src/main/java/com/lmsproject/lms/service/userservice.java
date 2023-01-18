package com.lmsproject.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lmsproject.lms.model.user;
import com.lmsproject.repository.userrepository;

@Service
public class userservice {
	
	@Autowired
	private userrepository ur;
	
	@Autowired
	public user reisteruser(user user) {
		return ur.save(user);
	}

}
