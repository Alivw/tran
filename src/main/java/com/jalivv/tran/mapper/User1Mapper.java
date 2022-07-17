package com.jalivv.tran.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jalivv.tran.entity.User1;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface User1Mapper extends BaseMapper<User1> {
    int updateBatch(List<User1> list);

    int updateBatchSelective(List<User1> list);

    int batchInsert(@Param("list") List<User1> list);
}