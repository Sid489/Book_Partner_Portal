package com.cg.dto;

import java.util.List;

import lombok.*;

/*
* @author Siddhant
* DTO for API number 4
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PublisherEmployeeResponseDTO {

    private String pubId;
    private String pubName;
    private List<EmployeeWithJobDTO> employees;
}
