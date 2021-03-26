package com.ljf.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.ljf.common.utils.PageUtils;
import com.ljf.gmall.member.entity.MemberEntity;
import com.ljf.gmall.member.exception.PhoneException;
import com.ljf.gmall.member.exception.UsernameException;
import com.ljf.gmall.member.vo.MemberUserLoginVo;
import com.ljf.gmall.member.vo.MemberUserRegisterVo;
import com.ljf.gmall.member.vo.SocialUser;

import java.util.Map;


public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 用户注册
     * @param vo
     */
    void register(MemberUserRegisterVo vo);

    /**
     * 判断邮箱是否重复
     * @param phone
     * @return
     */
    void checkPhoneUnique(String phone) throws PhoneException;

    /**
     * 判断用户名是否重复
     * @param userName
     * @return
     */
    void checkUserNameUnique(String userName) throws UsernameException;

    /**
     * 用户登录
     * @param vo
     * @return
     */
    MemberEntity login(MemberUserLoginVo vo);

    /**
     * 社交用户的登录
     * @param socialUser
     * @return
     */
    MemberEntity login(SocialUser socialUser) throws Exception;

}

