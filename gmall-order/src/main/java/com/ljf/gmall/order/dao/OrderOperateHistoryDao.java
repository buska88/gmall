package com.ljf.gmall.order.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljf.gmall.order.entity.OrderOperateHistoryEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
