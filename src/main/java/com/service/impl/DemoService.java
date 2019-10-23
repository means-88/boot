package com.service.impl;

import java.util.*;
import com.entity.*;
import com.service.IDemoService;
import com.dao.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: boot
 * @description:
 * @author: Means
 * @create: 2019-08-27 17:18
 **/

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("demoService")
public class DemoService implements IDemoService {

    @Autowired
    private IDemoDao dao;


    @Override
    public List<Demo> selectAll() {
        return dao.selectAll();
    }
}
