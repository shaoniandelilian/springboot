package com.demo.service.Impl;

import com.demo.mapper.SatelliteSceneMapper;
import com.demo.mapper.ZhuCeMapper;
import com.demo.model.SatelliteScene;
import com.demo.model.zhuce;
import com.demo.service.SatelliteSceneService;
import com.demo.service.ZhuCeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouyulong
 * @date 2018/10/28 下午2:46.
 */
@Service
public class SatelliteSceneImpl implements SatelliteSceneService {
    @Autowired
    private SatelliteSceneMapper satellitesceneMapper;

    @Override
    public void insertSatelliteScene(SatelliteScene ss) {
         satellitesceneMapper.insertSatelliteScene(ss);
    }

    @Override
    public void truncateTable() {
        satellitesceneMapper.truncateTable();
    }

    @Override
    public void console_showTable() {
        satellitesceneMapper.console_showTable();
    }

    @Override
    public void messageTable() {
        satellitesceneMapper.messageTable();
    }

    @Override
    public void hhhTable() {
        satellitesceneMapper.hhhTable();
    }

    @Override
    public void hhh1Table() {
        satellitesceneMapper.hhh1Table();
    }

    @Override
    public void hhh2Table() {
        satellitesceneMapper.hhh2Table();
    }

    @Override
    public void hhh3Table() {
        satellitesceneMapper.hhh3Table();
    }

}
