package com.ljf.gmall.order.vo;

import com.ljf.gmall.order.entity.OrderEntity;
import lombok.Data;



@Data
public class SubmitOrderResponseVo {

    private OrderEntity order;

    /** 错误状态码 **/
    private Integer code;


}
