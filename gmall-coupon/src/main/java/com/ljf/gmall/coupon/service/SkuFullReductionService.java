package com.ljf.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljf.common.to.SkuReductionTo;
import com.ljf.common.utils.PageUtils;
import com.ljf.gmall.coupon.entity.SkuFullReductionEntity;


import java.util.Map;


public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);


}

