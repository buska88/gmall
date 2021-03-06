package com.ljf.gmall.member.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljf.gmall.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
