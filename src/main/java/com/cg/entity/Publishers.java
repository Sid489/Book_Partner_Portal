package com.cg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/*
 * @author Siddhant*/
@Entity
@Table(name="publishers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publishers {

    @Id
    @Column(name="pub_id",length=4,nullable=false)
    private String pubId;

    @Column(name = "pub_name", length = 40)
    private String pubName;

    @Column(name = "city", length = 20)
    private String city;

    @Column(name = "state", length = 2)
    private String state;

    @Column(name = "country", length = 30)
    private String country = "USA";

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Title> titles;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Employee> employees;
}
