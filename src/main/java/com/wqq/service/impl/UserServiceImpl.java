package com.wqq.service.impl;

import com.wqq.dao.UUserMapper;
import com.wqq.po.UUser;
import com.wqq.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    UUserMapper uUserMapper;
    public UUser find() {
        return uUserMapper.selectByPrimaryKey(1L);
    }
}
