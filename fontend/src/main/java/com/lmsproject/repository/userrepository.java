package com.lmsproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lmsproject.lms.model.user;

@Repository
public interface userrepository extends CrudRepository<user, Integer>{

}
