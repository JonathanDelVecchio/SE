/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sebe.service;

import com.sebe.dto.ExtracurricularDTO;
import java.util.List;

public interface ExtracurricularService {
    ExtracurricularDTO createExtracurricular(ExtracurricularDTO extracurricularDTO);
    ExtracurricularDTO getExtracurricularById(Long id);
    List<ExtracurricularDTO> getAllExtracurriculars();
    ExtracurricularDTO updateExtracurricular(Long id, ExtracurricularDTO extracurricularDTO);
    void deleteExtracurricular(Long id);
}
