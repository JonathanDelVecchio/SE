/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sebe.service;

import com.sebe.dto.JobReferralDTO;
import java.util.List;

public interface JobReferralService {
    JobReferralDTO createJobReferral(JobReferralDTO jobReferralDTO);
    JobReferralDTO getJobReferralById(Long id);
    List<JobReferralDTO> getAllJobReferrals();
    JobReferralDTO updateJobReferral(Long id, JobReferralDTO jobReferralDTO);
    void deleteJobReferral(Long id);
}
