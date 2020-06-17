package com.gmbe.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmbe.demo.models.Testimony;

public interface TestimonyRepository  extends JpaRepository<Testimony, Integer>{

}
