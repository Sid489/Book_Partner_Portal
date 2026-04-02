package com.cg.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRoyaltyDTO {

    private String authorId;
    private String authorName;
    private String titleId;
    private String titleName;
    private Integer minRoyalty;
    private Integer maxRoyalty;

}
