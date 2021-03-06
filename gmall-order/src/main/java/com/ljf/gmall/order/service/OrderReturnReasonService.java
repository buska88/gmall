package com.ljf.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.ljf.common.utils.PageUtils;
import com.ljf.gmall.order.entity.OrderReturnReasonEntity;

import java.util.Map;


public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

