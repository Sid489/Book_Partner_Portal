package com.cg.dto;

import java.util.List;

import lombok.*;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
/*
* @author Siddhant
* DTO for API number 4*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PublisherEmployeeResponseDTO {
    private String pubId;
    private String pubName;
    private List<EmployeeWithJobDTO> employees;
}
