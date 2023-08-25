package com.demo.controller;

import com.demo.model.zhuce;
import com.demo.service.SatelliteSceneService;
import com.demo.service.ZhuCeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author zhouyulong
 * @date 2018/10/28 下午2:43.
 */
@Controller
@RequestMapping(value = "/test2")
public class Test2Controller {
    @RequestMapping(value = "ss", method = RequestMethod.GET)
    @ResponseBody
    public RedirectView getList(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("data", "value");
        return new RedirectView("/test2/test2");
    }
    @RequestMapping(value = "test2", method = RequestMethod.GET)
    public String test2() {
        return "test2";
    }
}


