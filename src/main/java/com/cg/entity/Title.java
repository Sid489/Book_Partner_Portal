package com.cg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.time.LocalDateTime;
/*
 * @author Siddhant*/
@Entity
@Table(name="titles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Title {

    @Id
    @Column(name = "title_id", length = 10, nullable = false)
    private String titleId;

    @Column(name = "title", length = 80, nullable = false)
    private String title;

    @Column(name = "type", length = 12, nullable = false)
    private String type = "UNDECIDED";

    @Column(name = "price")
    private Double price;

    @Column(name = "advance")
    private Double advance;

    @Column(name = "royalty")
    private Integer royalty;

    @Column(name = "ytd_sales")
    private Integer ytdSales;

    @Column(name = "notes", length = 200)
    private String notes;

    @Column(name = "pubdate", nullable = false)
    private LocalDateTime pubdate;

    @ManyToOne
    @JoinColumn(name = "pub_id")
    private Publishers publisher;

    @OneToMany(mappedBy = "title", cascade = CascadeType.ALL)
    private List<TitleAuthor> titleAuthors;

    @OneToMany(mappedBy = "title", cascade = CascadeType.ALL)
    private List<Sale> sales;

    @OneToMany(mappedBy = "title", cascade = CascadeType.ALL)
    private List<RoySched> royschedList;

}
