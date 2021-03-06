package com.ljf.gmall.order.service.impl;

import com.ljf.common.utils.PageUtils;
import com.ljf.common.utils.Query;
import com.ljf.gmall.order.dao.OrderSettingDao;
import com.ljf.gmall.order.entity.OrderSettingEntity;
import com.ljf.gmall.order.service.OrderSettingService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSettingEntity> implements OrderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderSettingEntity> page = this.page(
                new Query<OrderSettingEntity>().getPage(params),
                new QueryWrapper<OrderSettingEntity>()
        );

        return new PageUtils(page);
    }

}