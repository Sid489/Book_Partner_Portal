package com.cg.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @author Siddhant*/
@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name = "emp_id", length = 10, nullable = false)
    private String empId;

    @Column(name = "fname", length = 20, nullable = false)
    private String firstName;

    @Column(name = "minit", length = 1)
    private String middleInitial;

    @Column(name = "lname", length = 30, nullable = false)
    private String lastName;

    @Column(name = "job_lvl")
    private Integer jobLevel = 10;

    @Column(name = "hire_date", nullable = false)
    private LocalDateTime hireDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pub_id", nullable = false)
    private Publishers publisher;

}
