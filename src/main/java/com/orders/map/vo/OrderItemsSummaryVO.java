package com.orders.map.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemsSummaryVO {

    private Long id;

    private Long idOrder;

    private String nameProduct;
}
