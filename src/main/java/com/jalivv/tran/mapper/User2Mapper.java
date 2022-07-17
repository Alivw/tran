package com.jalivv.tran.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jalivv.tran.entity.User2;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface User2Mapper extends BaseMapper<User2> {
    int updateBatch(List<User2> list);

    int updateBatchSelective(List<User2> list);

    int batchInsert(@Param("list") List<User2> list);
}