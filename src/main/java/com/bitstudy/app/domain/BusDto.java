package com.bitstudy.app.domain;

import java.util.Date;

public class BusDto {
    private int bus_seq;
    private String bus_num;
    private String bus_company;
    private int bus_level;
    private String bus_del_flag;
    private String bus_reg_id;
    private Date bus_reg_date;
    private String bus_modify_id;
    private Date bus_modify_date;


    public int getBus_seq() {
        return bus_seq;
    }

    public void setBus_seq(int bus_seq) {
        this.bus_seq = bus_seq;
    }

    public String getBus_num() {
        return bus_num;
    }

    public void setBus_num(String bus_num) {
        this.bus_num = bus_num;
    }

    public String getBus_company() {
        return bus_company;
    }

    public void setBus_company(String bus_company) {
        this.bus_company = bus_company;
    }

    public int getBus_level() {
        return bus_level;
    }

    public void setBus_level(int bus_level) {
        this.bus_level = bus_level;
    }

    public String getBus_del_flag() {
        return bus_del_flag;
    }

    public void setBus_del_flag(String bus_del_flag) {
        this.bus_del_flag = bus_del_flag;
    }

    public String getBus_reg_id() {
        return bus_reg_id;
    }

    public void setBus_reg_id(String bus_reg_id) {
        this.bus_reg_id = bus_reg_id;
    }

    public Date getBus_reg_date() {
        return bus_reg_date;
    }

    public void setBus_reg_date(Date bus_reg_date) {
        this.bus_reg_date = bus_reg_date;
    }

    public String getBus_modify_id() {
        return bus_modify_id;
    }

    public void setBus_modify_id(String bus_modify_id) {
        this.bus_modify_id = bus_modify_id;
    }

    public Date getBus_modify_date() {
        return bus_modify_date;
    }

    public void setBus_modify_date(Date bus_modify_date) {
        this.bus_modify_date = bus_modify_date;
    }

    @Override
    public String toString() {
        return "BusDto{" +
                "bus_seq=" + bus_seq +
                ", bus_num='" + bus_num + '\'' +
                ", bus_company='" + bus_company + '\'' +
                ", bus_level=" + bus_level +
                ", bus_del_flag='" + bus_del_flag + '\'' +
                ", bus_reg_id='" + bus_reg_id + '\'' +
                ", bus_reg_date=" + bus_reg_date +
                ", bus_modify_id='" + bus_modify_id + '\'' +
                ", bus_modify_date=" + bus_modify_date +
                '}';
    }
}
