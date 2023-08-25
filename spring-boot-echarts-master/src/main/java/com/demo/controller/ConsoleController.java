package com.demo.controller;

import com.demo.service.ConsoleService;
import com.demo.service.DataService;
import com.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouyulong
 * @date 2018/10/28 下午2:43.
 */
@Controller
@RequestMapping(value = "/")
public class ConsoleController {

    @Autowired
    private ConsoleService consoleService;

    @RequestMapping(value = "/console", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList() {
        Map<String,Object> map = new HashMap<>();
        map.put("data", consoleService.findConsoleAll());
        return map;
    }




}


