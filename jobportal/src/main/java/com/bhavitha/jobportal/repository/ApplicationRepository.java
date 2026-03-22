package com.bhavitha.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavitha.jobportal.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
