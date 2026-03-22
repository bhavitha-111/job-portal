package com.bhavitha.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bhavitha.jobportal.entity.Application;
import com.bhavitha.jobportal.repository.ApplicationRepository;

import java.util.List;

@RestController
@RequestMapping("/applications")
@CrossOrigin(origins = "*")

public class ApplicationController {

    @Autowired
    private ApplicationRepository appRepo;

    @PostMapping("/apply")
    public Application apply(@RequestBody Application app) {
        return appRepo.save(app);
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return appRepo.findAll();
    }
}
