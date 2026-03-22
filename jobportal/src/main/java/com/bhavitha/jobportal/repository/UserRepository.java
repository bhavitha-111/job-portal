package com.bhavitha.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavitha.jobportal.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailAndPassword(String email, String password);

}
