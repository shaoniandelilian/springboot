package com.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description:
 * @Author: ylp
 * @CreateTime: 2023-07-22 19:59
 */

@Data
@TableName("hhh1")
public class Rate {
    private Integer id;
    private Double rate;
}
