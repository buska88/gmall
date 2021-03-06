package com.ljf.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.ljf.common.utils.PageUtils;
import com.ljf.gmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;


public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

