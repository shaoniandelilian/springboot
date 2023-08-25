package com.demo.mapper;

import com.demo.model.grouping;
import com.demo.model.zhuce;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: ylp
 * @CreateTime: 2023-07-22 16:52
 */

@Mapper
public interface ZhuCeMapper {
    void insertZhuCe(zhuce zc);
}
