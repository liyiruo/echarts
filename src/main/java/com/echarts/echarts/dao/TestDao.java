package com.echarts.echarts.dao;

import com.echarts.echarts.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    User selectOne(int id);
}
