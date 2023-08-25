package com.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description:
 * @Author: ylp
 * @CreateTime: 2023-07-22 20:12
 */

@Data
@TableName("console_show")
public class Console {
    private Integer id;
    private String  console;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public Console(Integer id, String console) {
        this.id = id;
        this.console = console;
    }

    public Console() {
    }
}
