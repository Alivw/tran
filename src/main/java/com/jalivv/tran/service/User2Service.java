package com.jalivv.tran.service;

import java.util.List;
import com.jalivv.tran.entity.User2;
import com.baomidou.mybatisplus.extension.service.IService;
public interface User2Service extends IService<User2>{


    int updateBatch(List<User2> list);

    int updateBatchSelective(List<User2> list);

    int batchInsert(List<User2> list);

    public void addRequired(User2 user);


    public void addRequiredException(User2 user);
}
