package com.cg.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
* @author Siddhant
* DTO for API number 4*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobDTO {
    private Short jobId;
    private String jobDesc;
    private Integer minLvl;
    private Integer maxLvl;


}

