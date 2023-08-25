package com.demo.mapper;

import com.demo.model.SatelliteScene;
import com.demo.model.zhuce;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: ylp
 * @CreateTime: 2023-07-22 16:52
 */

@Mapper
public interface SatelliteSceneMapper {
    void insertSatelliteScene(SatelliteScene ss);
    void truncateTable ();
   void console_showTable() ;

  void messageTable() ;


    void hhhTable() ;


   void hhh1Table() ;


    void hhh2Table() ;


    void hhh3Table() ;
}
