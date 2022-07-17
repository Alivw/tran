package com.jalivv.tran.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jalivv.tran.entity.User;
import com.jalivv.tran.mapper.UserMapper;
import com.jalivv.tran.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public int updateBatch(List<User> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<User> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<User> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User user) {
        baseMapper.insert(user);
    }



}




