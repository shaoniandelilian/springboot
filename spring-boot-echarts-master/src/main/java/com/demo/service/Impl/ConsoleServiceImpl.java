package com.demo.service.Impl;

import com.demo.mapper.ConsoleMapper;
import com.demo.mapper.ZhuCeMapper;
import com.demo.model.Console;
import com.demo.model.Index;
import com.demo.model.zhuce;
import com.demo.service.ConsoleService;
import com.demo.service.ZhuCeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouyulong
 * @date 2018/10/28 下午2:46.
 */
@Service
public class ConsoleServiceImpl implements ConsoleService {
    @Autowired
    private ConsoleMapper consoleMapperr;

    @Override
    public List<Console> findConsoleAll() {
        return consoleMapperr.findConsoleAll();
    }

}
