package com.jalivv.tran.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.jalivv.tran.entity.User2;
import com.jalivv.tran.mapper.User2Mapper;
import com.jalivv.tran.service.User2Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class User2ServiceImpl extends ServiceImpl<User2Mapper, User2> implements User2Service{

    @Override
    public int updateBatch(List<User2> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<User2> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<User2> list) {
        return baseMapper.batchInsert(list);
    }


    //省略其他...
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User2 user) {
        baseMapper.insert(user);
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequiredException(User2 user){
        baseMapper.insert(user);
        throw new RuntimeException();
    }
}
