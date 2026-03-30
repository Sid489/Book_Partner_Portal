package com.cg.dto;
import lombok.*;
/*
* @author Siddhant
* DTO for API Number 7*/
@Data
//@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopPublisherDTO {
    private String pubId;
    private String pubName;
    private Number totalSales;
    private Number totalRevenue;
    public TopPublisherDTO(String pubId, String pubName,Number totalSales, Number totalRevenue) {
        this.pubId = pubId;
        this.pubName = pubName;
        this.totalSales = totalSales;
        this.totalRevenue = totalRevenue;
    }
}

