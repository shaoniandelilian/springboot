package com.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@TableName("satellite_scene_setting")
@Component
public class SatelliteScene {
    Integer gaogui_num;
    Integer zhonggui_num;
    Integer digui_num;
    String attack_target;
    String fire_intensity;

    public Integer getGaogu_num() {
        return gaogui_num;
    }

    public void setGaogu_num(Integer gaogu_num) {
        this.gaogui_num = gaogu_num;
    }

    public Integer getZhonggui_num() {
        return zhonggui_num;
    }

    public void setZhonggui_num(Integer zhonggui_num) {
        this.zhonggui_num = zhonggui_num;
    }

    public Integer getDigui_num() {
        return digui_num;
    }

    public void setDigui_num(Integer digui_num) {
        this.digui_num = digui_num;
    }

    public String getAttack_target() {
        return attack_target;
    }

    public void setAttack_target(String attack_target) {
        this.attack_target = attack_target;
    }

    public String getFire_intensity() {
        return fire_intensity;
    }

    public void setFire_intensity(String fire_intensity) {
        this.fire_intensity = fire_intensity;
    }

    public SatelliteScene(Integer gaogu_num, Integer zhonggui_num, Integer digui_num, String attack_target, String fire_intensity) {
        this.gaogui_num = gaogu_num;
        this.zhonggui_num = zhonggui_num;
        this.digui_num = digui_num;
        this.attack_target = attack_target;
        this.fire_intensity = fire_intensity;
    }

    public SatelliteScene() {
    }

    @Override
    public String toString() {
        return "SatelliteScene{" +
                "gaogui_num=" + gaogui_num +
                ", zhonggui_num=" + zhonggui_num +
                ", digui_num=" + digui_num +
                ", attack_target='" + attack_target + '\'' +
                ", fire_intensity='" + fire_intensity + '\'' +
                '}';
    }
}
