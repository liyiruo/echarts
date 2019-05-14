package com.echarts.echarts.service;

import com.echarts.echarts.dao.TestDao;
import com.echarts.echarts.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServceImpl implements TestServce {
    @Autowired
    private TestDao testDao;
    @Override
    public User selectOne(int id) {
        return testDao.selectOne(id);
    }
}
