package com.xudq.mychart.bean;

/**
 * Created by TJZM-14
 * AUTHOR: xudingqiang@teejo.com.cn
 * DATE: 2018/1/24
 * DESC:
 */

public class PieDataEntity {
    private String name;
    private float value;
    private float percent;
    private int color = 0;
    private float angle = 0;

    public PieDataEntity(String name, float value, int color) {
        this.name = name;
        this.value = value;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getpercent() {
        return percent;
    }

    public void setpercent(float percent) {
        this.percent = percent;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

}
