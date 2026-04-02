package com.cg.dto;
import lombok.*;

/*
* @author Siddhant
* DTO for API Number 7
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopPublisherDTO {

    private String pubId;
    private String pubName;
    private Number totalSales;
    private Number totalRevenue;

}

