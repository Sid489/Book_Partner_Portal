package com.cg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author Siddhant*/
@Entity
@Table(name="titleauthor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TitleAuthor {

    @EmbeddedId
    private TitleAuthorId id;

    @Column(name = "au_ord")
    private Byte auOrd;

    @Column(name = "royaltyper")
    private Integer royaltyPer;

    @ManyToOne
    @MapsId("auId")   // Maps composite key field
    @JoinColumn(name = "au_id")
    private Authors authors;

    @ManyToOne
    @MapsId("titleId")
    @JoinColumn(name = "title_id")
    private Title title;

}

