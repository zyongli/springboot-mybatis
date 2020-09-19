package com.lzy.mybatis.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MybatisService {
    @Autowired
    private MybatisDao mybatisDao;
    String getName() {
        return mybatisDao.getName().toString();
    }
}
