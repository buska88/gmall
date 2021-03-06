package com.ljf.gmall.order.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljf.gmall.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
    /**
     * 修改订单状态
     * @param orderSn
     * @param code
     * @param payType
     */
    void updateOrderStatus(@Param("orderSn") String orderSn,
                           @Param("code") Integer code,
                           @Param("payType") Integer payType);
	
}
