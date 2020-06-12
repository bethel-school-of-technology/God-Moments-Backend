package com.godmomentsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godmoments.users.Users;

@Repository
public interface PostRepository extends JpaRepository <Users, String>{
	Users findByUsername(String username);

}
