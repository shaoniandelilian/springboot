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
@RequestMapping(value = "/second")
public class SecondController {
    @RequestMapping(value = "choose", method = RequestMethod.GET)
    public String choose() {
        return "choose";
    }
}


