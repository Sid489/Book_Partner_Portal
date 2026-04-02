package com.cg.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @author Siddhant
* DTO for api number 4
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeWithJobDTO {

    private String empId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private Integer jobLevel;
    private LocalDateTime hireDate;
    private JobDTO job;
}

