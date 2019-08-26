package com.testmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testmanagement.model.DAOUser;

@Repository
public interface UserDAO extends CrudRepository<DAOUser, Integer> {
}

