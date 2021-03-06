package com.ljf.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.ljf.common.utils.PageUtils;
import com.ljf.gmall.member.entity.MemberLoginLogEntity;

import java.util.Map;


public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

