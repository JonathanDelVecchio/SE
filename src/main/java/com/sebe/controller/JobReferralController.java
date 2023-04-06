/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebe.controller;

import com.sebe.dto.JobReferralDTO;
import com.sebe.service.JobReferralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-referrals")
public class JobReferralController {

    @Autowired
    private JobReferralService jobReferralService;

    @PostMapping
    public ResponseEntity<JobReferralDTO> createJobReferral(@RequestBody JobReferralDTO jobReferralDTO) {
        JobReferralDTO createdJobReferral = jobReferralService.createJobReferral(jobReferralDTO);
        return new ResponseEntity<>(createdJobReferral, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobReferralDTO> getJobReferralById(@PathVariable Long id) {
        JobReferralDTO jobReferralDTO = jobReferralService.getJobReferralById(id);
        return new ResponseEntity<>(jobReferralDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<JobReferralDTO>> getAllJobReferrals() {
        List<JobReferralDTO> jobReferrals = jobReferralService.getAllJobReferrals();
        return new ResponseEntity<>(jobReferrals, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobReferralDTO> updateJobReferral(@PathVariable Long id, @RequestBody JobReferralDTO jobReferralDTO) {
        JobReferralDTO updatedJobReferral = jobReferralService.updateJobReferral(id, jobReferralDTO);
        return new ResponseEntity<>(updatedJobReferral, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobReferral(@PathVariable Long id) {
        jobReferralService.deleteJobReferral(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
