package com.bhavitha.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bhavitha.jobportal.entity.Job;
import com.bhavitha.jobportal.repository.JobRepository;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "*")

public class JobController {

    @Autowired
    private JobRepository jobRepo;

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobRepo.save(job);
    }

    @GetMapping
    public List<Job> getJobs() {
        return jobRepo.findAll();
    }
}
