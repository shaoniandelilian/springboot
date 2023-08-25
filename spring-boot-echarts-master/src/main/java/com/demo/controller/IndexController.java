package com.demo.controller;

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
public class IndexController {

    @Autowired
    private IndexService indexService;

    @Autowired
    private DataService dataservice;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index1() {
        return "index";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", indexService.findAll());
        return map;
    }
    // 右下角图表的编号
    @RequestMapping(value = "/list4", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList4() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", dataservice.findAll());
        return map;
    }
    // 左上角图表的编号
    @RequestMapping(value = "/list1", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList1() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", dataservice.findRateAll());
        return map;
    }
    // 右上角图表的编号
    @RequestMapping(value = "/list2", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList2() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", dataservice.findTimeAll());
        return map;
    }

    @RequestMapping(value = "/list3", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList3() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", dataservice.findNumberAll());
        return map;
    }

    @RequestMapping(value = "/list5", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList5() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", dataservice.findNumberAll());
        return map;
    }
}


