/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebe.service.impl;

import com.sebe.dto.JobReferralDTO;
import com.sebe.mapper.JobReferralMapper;
import com.sebe.model.JobReferral;
import com.sebe.repository.JobReferralRepository;
import com.sebe.service.JobReferralService;
import com.sebe.service.JobReferralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sebe.exception.ResourceNotFoundException;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobReferralServiceImpl implements JobReferralService {

    @Autowired
    private JobReferralRepository jobReferralRepository;
    @Autowired
    private JobReferralMapper jobReferralMapper;

    @Override
    public List<JobReferralDTO> getAllJobReferrals() {
        return jobReferralRepository.findAll()
                .stream()
                .map(jobReferralMapper::toJobReferralDTO)
                .collect(Collectors.toList());
    }

    @Override
    public JobReferralDTO createJobReferral(JobReferralDTO jobReferralDTO) {
        JobReferral jobReferral = jobReferralMapper.toJobReferral(jobReferralDTO);
        JobReferral savedJobReferral = jobReferralRepository.save(jobReferral);
        return jobReferralMapper.toJobReferralDTO(savedJobReferral);
    }

    @Override
    public void deleteJobReferral(Long id) {
        jobReferralRepository.deleteById(id);
    }

    @Override
    public JobReferralDTO updateJobReferral(Long id, JobReferralDTO jobReferralDTO) {
        JobReferral jobReferral = jobReferralMapper.toJobReferral(jobReferralDTO);
        jobReferral.setId(id);
        JobReferral updatedJobReferral = jobReferralRepository.save(jobReferral);
        return jobReferralMapper.toJobReferralDTO(updatedJobReferral);
    }

    @Override
    public JobReferralDTO getJobReferralById(Long id) {
        JobReferral jobReferral = jobReferralRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Job referral not found with id: " + id));
        return jobReferralMapper.toJobReferralDTO(jobReferral);
    }
}
