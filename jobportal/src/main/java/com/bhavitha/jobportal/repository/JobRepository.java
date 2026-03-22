package com.bhavitha.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavitha.jobportal.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
