package com.ljf.gmall.member.service.impl;

import com.ljf.common.utils.PageUtils;
import com.ljf.common.utils.Query;
import com.ljf.gmall.member.dao.MemberStatisticsInfoDao;
import com.ljf.gmall.member.entity.MemberStatisticsInfoEntity;
import com.ljf.gmall.member.service.MemberStatisticsInfoService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity> implements MemberStatisticsInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberStatisticsInfoEntity> page = this.page(
                new Query<MemberStatisticsInfoEntity>().getPage(params),
                new QueryWrapper<MemberStatisticsInfoEntity>()
        );

        return new PageUtils(page);
    }

}