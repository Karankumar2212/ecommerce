package com.boredApes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boredApes.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
}
