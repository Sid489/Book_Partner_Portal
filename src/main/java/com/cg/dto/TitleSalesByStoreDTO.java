package com.cg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TitleSalesByStoreDTO {

    private String titleId;
    private String title;
    private String type;
    private Double price;

    private String storeId;
    private String storeName;
    private String storeCity;
    private Short quantitySold;
}