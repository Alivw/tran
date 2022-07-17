package com.jalivv.tran.service;

import java.util.List;
import com.jalivv.tran.entity.User1;
import com.baomidou.mybatisplus.extension.service.IService;

public interface User1Service extends IService<User1> {


    int updateBatch(List<User1> list);

    int updateBatchSelective(List<User1> list);

    int batchInsert(List<User1> list);


    public void addRequired(User1 user);


}




