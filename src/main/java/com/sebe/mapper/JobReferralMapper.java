/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebe.mapper;

import com.sebe.dto.JobReferralDTO;
import com.sebe.model.JobReferral;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JobReferralMapper {
    
    JobReferralDTO toJobReferralDTO(JobReferral jobReferral);

    JobReferral toJobReferral(JobReferralDTO jobReferralDTO);

    List<JobReferralDTO> toJobReferralDTOs(List<JobReferral> jobReferrals);

    List<JobReferral> toJobReferrals(List<JobReferralDTO> jobReferralDTOs);
}
