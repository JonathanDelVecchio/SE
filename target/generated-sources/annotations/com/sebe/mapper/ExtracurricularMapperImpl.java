package com.sebe.mapper;

import com.sebe.dto.ExtracurricularDTO;
import com.sebe.model.Extracurricular;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-06T11:42:50-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class ExtracurricularMapperImpl implements ExtracurricularMapper {

    @Override
    public ExtracurricularDTO toExtracurricularDTO(Extracurricular extracurricular) {
        if ( extracurricular == null ) {
            return null;
        }

        ExtracurricularDTO extracurricularDTO = new ExtracurricularDTO();

        extracurricularDTO.setId( extracurricular.getId() );
        extracurricularDTO.setSportsParticipation( extracurricular.getSportsParticipation() );
        extracurricularDTO.setSportName( extracurricular.getSportName() );
        extracurricularDTO.setFraternitySororityParticipation( extracurricular.getFraternitySororityParticipation() );
        extracurricularDTO.setFraternitySororityName( extracurricular.getFraternitySororityName() );
        extracurricularDTO.setInternshipParticipation( extracurricular.getInternshipParticipation() );
        extracurricularDTO.setCompanyName( extracurricular.getCompanyName() );
        extracurricularDTO.setInternshipTitle( extracurricular.getInternshipTitle() );
        extracurricularDTO.setInternshipYears( extracurricular.getInternshipYears() );

        return extracurricularDTO;
    }

    @Override
    public Extracurricular toExtracurricular(ExtracurricularDTO extracurricularDTO) {
        if ( extracurricularDTO == null ) {
            return null;
        }

        Extracurricular extracurricular = new Extracurricular();

        extracurricular.setId( extracurricularDTO.getId() );
        extracurricular.setSportsParticipation( extracurricularDTO.getSportsParticipation() );
        extracurricular.setSportName( extracurricularDTO.getSportName() );
        extracurricular.setFraternitySororityParticipation( extracurricularDTO.getFraternitySororityParticipation() );
        extracurricular.setFraternitySororityName( extracurricularDTO.getFraternitySororityName() );
        extracurricular.setInternshipParticipation( extracurricularDTO.getInternshipParticipation() );
        extracurricular.setCompanyName( extracurricularDTO.getCompanyName() );
        extracurricular.setInternshipTitle( extracurricularDTO.getInternshipTitle() );
        extracurricular.setInternshipYears( extracurricularDTO.getInternshipYears() );

        return extracurricular;
    }

    @Override
    public List<ExtracurricularDTO> toExtracurricularDTOs(List<Extracurricular> extracurriculars) {
        if ( extracurriculars == null ) {
            return null;
        }

        List<ExtracurricularDTO> list = new ArrayList<ExtracurricularDTO>( extracurriculars.size() );
        for ( Extracurricular extracurricular : extracurriculars ) {
            list.add( toExtracurricularDTO( extracurricular ) );
        }

        return list;
    }

    @Override
    public List<Extracurricular> toExtracurriculars(List<ExtracurricularDTO> extracurricularDTOs) {
        if ( extracurricularDTOs == null ) {
            return null;
        }

        List<Extracurricular> list = new ArrayList<Extracurricular>( extracurricularDTOs.size() );
        for ( ExtracurricularDTO extracurricularDTO : extracurricularDTOs ) {
            list.add( toExtracurricular( extracurricularDTO ) );
        }

        return list;
    }
}
