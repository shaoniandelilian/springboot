package com.demo.mapper;

import com.demo.model.Console;
import com.demo.model.Time;
import com.demo.model.zhuce;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: ylp
 * @CreateTime: 2023-07-22 16:52
 */

@Mapper
public interface ConsoleMapper {
    List<Console> findConsoleAll();
}
