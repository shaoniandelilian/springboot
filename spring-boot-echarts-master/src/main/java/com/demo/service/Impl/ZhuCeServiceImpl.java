package com.demo.service.Impl;

import com.demo.mapper.ZhuCeMapper;
import com.demo.model.zhuce;
import com.demo.service.ZhuCeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouyulong
 * @date 2018/10/28 下午2:46.
 */
@Service
public class ZhuCeServiceImpl implements ZhuCeService {
    @Autowired
    private ZhuCeMapper zhuCeMapper;

    @Override
    public void insertZhuCe(zhuce zc) {
         zhuCeMapper.insertZhuCe(zc);
    }

}
