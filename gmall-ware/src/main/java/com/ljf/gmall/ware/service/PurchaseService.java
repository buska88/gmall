package com.ljf.gmall.ware.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.ljf.common.utils.PageUtils;
import com.ljf.gmall.ware.entity.PurchaseEntity;
import com.ljf.gmall.ware.vo.MergeVo;
import com.ljf.gmall.ware.vo.PurchaseDoneVo;

import java.util.List;
import java.util.Map;


public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);


    void mergePurchase(MergeVo mergeVo);


    void received(List<Long> ids);


    void done(PurchaseDoneVo doneVo);


}

