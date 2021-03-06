package com.ljf.gmall.order.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljf.gmall.order.entity.OrderItemEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
