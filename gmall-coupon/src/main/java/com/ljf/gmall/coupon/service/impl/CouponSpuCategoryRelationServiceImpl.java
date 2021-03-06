package com.ljf.gmall.coupon.service.impl;

import com.ljf.common.utils.PageUtils;
import com.ljf.common.utils.Query;
import com.ljf.gmall.coupon.dao.CouponSpuCategoryRelationDao;
import com.ljf.gmall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.ljf.gmall.coupon.service.CouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl extends ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity> implements CouponSpuCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuCategoryRelationEntity> page = this.page(
                new Query<CouponSpuCategoryRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}