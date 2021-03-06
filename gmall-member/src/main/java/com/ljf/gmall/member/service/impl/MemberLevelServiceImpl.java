package com.ljf.gmall.member.service.impl;

import com.ljf.common.utils.PageUtils;
import com.ljf.common.utils.Query;
import com.ljf.gmall.member.dao.MemberLevelDao;
import com.ljf.gmall.member.entity.MemberLevelEntity;
import com.ljf.gmall.member.service.MemberLevelService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity> implements MemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberLevelEntity> page = this.page(
                new Query<MemberLevelEntity>().getPage(params),
                new QueryWrapper<MemberLevelEntity>()
        );

        return new PageUtils(page);
    }

}