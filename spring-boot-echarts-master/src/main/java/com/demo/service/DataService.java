package com.demo.service;

import com.demo.model.Number;
import com.demo.model.Rate;
import com.demo.model.Time;
import com.demo.model.grouping;

import java.util.List;

public interface DataService {
    List<grouping> findAll();
    List<Rate> findRateAll();
    List<Time> findTimeAll();
    List<Number> findNumberAll();
}
