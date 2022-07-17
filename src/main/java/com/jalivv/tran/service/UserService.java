package com.jalivv.tran.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jalivv.tran.entity.User;

import java.util.List;

public interface UserService extends IService<User> {


    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(List<User> list);


    public void addRequired(User user);


}




