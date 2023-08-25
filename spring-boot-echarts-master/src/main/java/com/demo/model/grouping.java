package com.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description:
 * @Author: ylp
 * @CreateTime: 2023-07-22 16:49
 */

@Data
@TableName("hhh")
public class grouping {
    private Integer id;
    private String head;
    private String element;
}
