package com.godmomentsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.godmomentsbackend.models.*;

@Repository
public interface HomeRepository extends JpaRepository <Users, String> {
Users findByEmail (String email);
}
