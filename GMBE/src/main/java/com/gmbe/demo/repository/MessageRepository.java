package com.gmbe.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gmbe.demo.models.Message;

public interface MessageRepository  extends JpaRepository<Message, Integer>{

}
