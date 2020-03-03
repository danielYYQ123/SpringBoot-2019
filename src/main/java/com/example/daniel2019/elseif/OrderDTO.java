package com.example.daniel2019.elseif;

import lombok.*;

import java.math.BigDecimal;

/**
 * @Author: DanielYu
 * @Date: 2019/5/27 9:33
 * 订单实体
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    //public static final String TYPE_NORMALORDER = "1"; // 普通订单

    //public static final String TYPE_BULKORDER = "2";    // 团购订单

    //public static final String TYPE_PROMOTIONORDER = "3";// 促销订单

    private Long id;

    private String code;

    private BigDecimal price;

    private String type;

}
