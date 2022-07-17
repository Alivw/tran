package com.jalivv.tran.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jalivv.tran.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(@Param("list") List<User> list);
}