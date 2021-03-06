package com.ljf.gmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljf.common.utils.PageUtils;
import com.ljf.gmall.ware.entity.WareInfoEntity;
import com.ljf.gmall.ware.vo.FareVo;


import java.util.Map;


public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取运费和收货地址信息
     * @param addrId
     * @return
     */
    FareVo getFare(Long addrId);
}

