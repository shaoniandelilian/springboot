package com.demo.service.Impl;

import com.demo.mapper.List1Mapper;
import com.demo.mapper.List2Mapper;
import com.demo.mapper.List3Mapper;
import com.demo.mapper.List4Mapper;
import com.demo.model.Number;
import com.demo.model.Rate;
import com.demo.model.Time;
import com.demo.model.grouping;
import com.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: ylp
 * @CreateTime: 2023-07-22 16:51
 */

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private List4Mapper list4Mapper;

    @Autowired
    private List1Mapper list1Mapper;

    @Autowired
    private List2Mapper list2Mapper;

    @Autowired
    private List3Mapper list3Mapper;


    @Override
    public List<grouping> findAll() {
        return list4Mapper.findAll();
    }

    @Override
    public List<Rate> findRateAll() {
        return list1Mapper.findAll();
    }

    @Override
    public List<Time> findTimeAll() {
        return list2Mapper.findTimeAll();
    }

    @Override
    public List<Number> findNumberAll() {
        return list3Mapper.findNumberAll();
    }

}
