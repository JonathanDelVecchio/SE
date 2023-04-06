package com.sebe.mapper;

import com.sebe.dto.JobReferralDTO;
import com.sebe.model.JobReferral;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-05T23:33:00-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class JobReferralMapperImpl implements JobReferralMapper {

    @Override
    public JobReferralDTO toJobReferralDTO(JobReferral jobReferral) {
        if ( jobReferral == null ) {
            return null;
        }

        JobReferralDTO jobReferralDTO = new JobReferralDTO();

        jobReferralDTO.setId( jobReferral.getId() );
        jobReferralDTO.setProgramOrCompanyName( jobReferral.getProgramOrCompanyName() );
        jobReferralDTO.setUrlLink( jobReferral.getUrlLink() );
        jobReferralDTO.setSnippet( jobReferral.getSnippet() );
        jobReferralDTO.setSkillsRequired( jobReferral.getSkillsRequired() );

        return jobReferralDTO;
    }

    @Override
    public JobReferral toJobReferral(JobReferralDTO jobReferralDTO) {
        if ( jobReferralDTO == null ) {
            return null;
        }

        JobReferral jobReferral = new JobReferral();

        jobReferral.setId( jobReferralDTO.getId() );
        jobReferral.setProgramOrCompanyName( jobReferralDTO.getProgramOrCompanyName() );
        jobReferral.setUrlLink( jobReferralDTO.getUrlLink() );
        jobReferral.setSnippet( jobReferralDTO.getSnippet() );
        jobReferral.setSkillsRequired( jobReferralDTO.getSkillsRequired() );

        return jobReferral;
    }

    @Override
    public List<JobReferralDTO> toJobReferralDTOs(List<JobReferral> jobReferrals) {
        if ( jobReferrals == null ) {
            return null;
        }

        List<JobReferralDTO> list = new ArrayList<JobReferralDTO>( jobReferrals.size() );
        for ( JobReferral jobReferral : jobReferrals ) {
            list.add( toJobReferralDTO( jobReferral ) );
        }

        return list;
    }

    @Override
    public List<JobReferral> toJobReferrals(List<JobReferralDTO> jobReferralDTOs) {
        if ( jobReferralDTOs == null ) {
            return null;
        }

        List<JobReferral> list = new ArrayList<JobReferral>( jobReferralDTOs.size() );
        for ( JobReferralDTO jobReferralDTO : jobReferralDTOs ) {
            list.add( toJobReferral( jobReferralDTO ) );
        }

        return list;
    }
}
