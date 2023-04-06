/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebe.service.impl;

import com.sebe.dto.ExtracurricularDTO;
import com.sebe.mapper.ExtracurricularMapper;
import com.sebe.model.Extracurricular;
import com.sebe.repository.ExtracurricularRepository;
import com.sebe.service.ExtracurricularService;
import com.sebe.service.ExtracurricularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sebe.exception.ResourceNotFoundException;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExtracurricularServiceImpl implements ExtracurricularService {

    @Autowired
    private ExtracurricularRepository extracurricularRepository;
    @Autowired
    private ExtracurricularMapper extracurricularMapper;

    @Override
    public List<ExtracurricularDTO> getAllExtracurriculars() {
        return extracurricularRepository.findAll()
                .stream()
                .map(extracurricularMapper::toExtracurricularDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ExtracurricularDTO createExtracurricular(ExtracurricularDTO extracurricularDTO) {
        Extracurricular extracurricular = extracurricularMapper.toExtracurricular(extracurricularDTO);
        Extracurricular savedExtracurricular = extracurricularRepository.save(extracurricular);
        return extracurricularMapper.toExtracurricularDTO(savedExtracurricular);
    }

    @Override
    public void deleteExtracurricular(Long id) {
        extracurricularRepository.deleteById(id);
    }

    @Override
    public ExtracurricularDTO updateExtracurricular(Long id, ExtracurricularDTO extracurricularDTO) {
        Extracurricular extracurricular = extracurricularMapper.toExtracurricular(extracurricularDTO);
        extracurricular.setId(id);
        Extracurricular updatedExtracurricular = extracurricularRepository.save(extracurricular);
        return extracurricularMapper.toExtracurricularDTO(updatedExtracurricular);
    }

    @Override
    public ExtracurricularDTO getExtracurricularById(Long id) {
        Extracurricular extracurricular = extracurricularRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Extracurricular not found with id: " + id));
        return extracurricularMapper.toExtracurricularDTO(extracurricular);
    }
}
