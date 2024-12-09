package com.bitstudy.app.domain;

import java.util.Date;

public class TimeDto {

    private int time_seq;
    private String time_start_name;
    private String time_end_name;
    private int time_bus_seq;
    private String time_del_flag;
    private String time_reg_id;
    private Date time_reg_date;
    private String time_modify_id;
    private Date time_modify_date;
    private Date time_start_date;
    private Date time_end_date;


    public int getTime_seq() {
        return time_seq;
    }

    public void setTime_seq(int time_seq) {
        this.time_seq = time_seq;
    }

    public String getTime_start_name() {
        return time_start_name;
    }

    public void setTime_start_name(String time_start_name) {
        this.time_start_name = time_start_name;
    }

    public String getTime_end_name() {
        return time_end_name;
    }

    public void setTime_end_name(String time_end_name) {
        this.time_end_name = time_end_name;
    }

    public int getTime_bus_seq() {
        return time_bus_seq;
    }

    public void setTime_bus_seq(int time_bus_seq) {
        this.time_bus_seq = time_bus_seq;
    }

    public String getTime_del_flag() {
        return time_del_flag;
    }

    public void setTime_del_flag(String time_del_flag) {
        this.time_del_flag = time_del_flag;
    }

    public String getTime_reg_id() {
        return time_reg_id;
    }

    public void setTime_reg_id(String time_reg_id) {
        this.time_reg_id = time_reg_id;
    }

    public Date getTime_reg_date() {
        return time_reg_date;
    }

    public void setTime_reg_date(Date time_reg_date) {
        this.time_reg_date = time_reg_date;
    }

    public String getTime_modify_id() {
        return time_modify_id;
    }

    public void setTime_modify_id(String time_modify_id) {
        this.time_modify_id = time_modify_id;
    }

    public Date getTime_modify_date() {
        return time_modify_date;
    }

    public void setTime_modify_date(Date time_modify_date) {
        this.time_modify_date = time_modify_date;
    }

    public Date getTime_start_date() {
        return time_start_date;
    }

    public void setTime_start_date(Date time_start_date) {
        this.time_start_date = time_start_date;
    }

    public Date getTime_end_date() {
        return time_end_date;
    }

    public void setTime_end_date(Date time_end_date) {
        this.time_end_date = time_end_date;
    }

    @Override
    public String toString() {
        return "TimeDto{" +
                "time_seq=" + time_seq +
                ", time_start_name='" + time_start_name + '\'' +
                ", time_end_name='" + time_end_name + '\'' +
                ", time_bus_seq=" + time_bus_seq +
                ", time_del_flag='" + time_del_flag + '\'' +
                ", time_reg_id='" + time_reg_id + '\'' +
                ", time_reg_date=" + time_reg_date +
                ", time_modify_id='" + time_modify_id + '\'' +
                ", time_modify_date=" + time_modify_date +
                ", time_start_date=" + time_start_date +
                ", time_end_date=" + time_end_date +
                '}';
    }
}
