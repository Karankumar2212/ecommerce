package com.boredApes.service;

import com.boredApes.exception.UserException;
import com.boredApes.model.User;

public interface UserService {

	public User findUserById(Long userId)throws UserException;
	
	public User findUserProfileByJwt(String jwt)throws UserException;
}
