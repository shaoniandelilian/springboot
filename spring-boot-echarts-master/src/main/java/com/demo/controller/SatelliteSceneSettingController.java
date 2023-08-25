package com.demo.controller;

import com.demo.model.SatelliteScene;
import com.demo.model.zhuce;
import com.demo.service.SatelliteSceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author zhouyulong
 * @date 2018/10/28 下午2:43.
 */
@RestController
public class SatelliteSceneSettingController {
    @Autowired
    private SatelliteSceneService satelliteSceneService;
    @PostMapping("/satellite/data")
    public ResponseEntity<Object> processData(@RequestBody SatelliteScene satelliteScene) {
        System.out.println("程序开始了");

        satelliteSceneService.truncateTable();
        satelliteSceneService.console_showTable();
        satelliteSceneService.messageTable();
        satelliteSceneService.hhhTable();
        satelliteSceneService.hhh1Table();
        satelliteSceneService.hhh2Table();
        satelliteSceneService.hhh3Table();

        satelliteSceneService.insertSatelliteScene(satelliteScene);
        System.out.println("程序结束了");
        // 返回响应
        return ResponseEntity.ok().build();
    }
    @RequestMapping(value = "index1", method = RequestMethod.GET)
    public String index1() {
        return "index1";
    }
}


