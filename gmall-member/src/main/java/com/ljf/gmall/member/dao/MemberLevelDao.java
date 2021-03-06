package com.ljf.gmall.member.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljf.gmall.member.entity.MemberLevelEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {

    MemberLevelEntity getDefaultLevel();
	
}
