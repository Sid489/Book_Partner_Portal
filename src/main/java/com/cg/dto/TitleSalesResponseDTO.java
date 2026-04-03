package com.cg.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TitleSalesResponseDTO {

    private String titleId;
    private String title;
    private String type;
    private Double price;

    private List<StoreSaleInfo> saleInfo;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StoreSaleInfo {
        private String storeId;
        private String storeName;
        private String storeCity;
        private Short quantitySold;
    }
}
