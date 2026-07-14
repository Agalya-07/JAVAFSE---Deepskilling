package com.cognizant.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}