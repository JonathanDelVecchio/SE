/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebe.mapper;

import com.sebe.dto.ExtracurricularDTO;
import com.sebe.model.Extracurricular;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExtracurricularMapper {
    
    ExtracurricularDTO toExtracurricularDTO(Extracurricular extracurricular);

    Extracurricular toExtracurricular(ExtracurricularDTO extracurricularDTO);

    List<ExtracurricularDTO> toExtracurricularDTOs(List<Extracurricular> extracurriculars);

    List<Extracurricular> toExtracurriculars(List<ExtracurricularDTO> extracurricularDTOs);
}
