package com.gmbe.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gmbe.demo.models.Users;

public interface UsersRepository  extends JpaRepository<Users, Integer>{

}
