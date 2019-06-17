package com.orders.map.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemsSummaryVO {

    private Long id;

    private Long idOrder;

    private String nameProduct;

    private Integer amount;

    private BigDecimal unitaryValue;
}
