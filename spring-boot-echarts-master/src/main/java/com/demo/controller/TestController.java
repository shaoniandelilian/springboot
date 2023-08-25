package com.demo.controller;

import com.demo.model.zhuce;
import com.demo.service.ZhuCeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author zhouyulong
 * @date 2018/10/28 下午2:43.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private ZhuCeService zhuCeService;
    @RequestMapping(value = "zhuce", method = RequestMethod.GET)
    @ResponseBody
    public RedirectView getList() {
        System.out.println("注册开始了");
        zhuce zc=new zhuce();
        zc.setUsername("xal");
        zc.setPassword("19990304");
        zhuCeService.insertZhuCe(zc);

        //zhuCeService.insertAll();
        return new RedirectView("/second/choose");
    }
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String choose() {
        return "test";
    }
}


