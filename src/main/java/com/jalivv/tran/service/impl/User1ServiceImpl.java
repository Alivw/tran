package com.jalivv.tran.service.impl;

import com.jalivv.tran.entity.User2;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.jalivv.tran.mapper.User1Mapper;
import com.jalivv.tran.entity.User1;
import com.jalivv.tran.service.User1Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class User1ServiceImpl extends ServiceImpl<User1Mapper, User1> implements User1Service {


    @Override
    public int updateBatch(List<User1> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<User1> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<User1> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User1 user){
        baseMapper.insert(user);
    }



}




