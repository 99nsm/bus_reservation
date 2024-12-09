package com.bitstudy.app.domain;

import java.util.Date;

public class UserDto {
    private int user_seq;
    private String user_id;
    private String user_pw;
    private String user_email;
    private String user_name;
    private String user_dob;
    private int uesr_login_count;
    private int user_level;
    private String uesr_del_flag;
    private String user_lock_status;
    private Date user_reg_date;


    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_dob() {
        return user_dob;
    }

    public void setUser_dob(String user_dob) {
        this.user_dob = user_dob;
    }

    public int getUesr_login_count() {
        return uesr_login_count;
    }

    public void setUesr_login_count(int uesr_login_count) {
        this.uesr_login_count = uesr_login_count;
    }

    public int getUser_level() {
        return user_level;
    }

    public void setUser_level(int user_level) {
        this.user_level = user_level;
    }

    public String getUesr_del_flag() {
        return uesr_del_flag;
    }

    public void setUesr_del_flag(String uesr_del_flag) {
        this.uesr_del_flag = uesr_del_flag;
    }

    public String getUser_lock_status() {
        return user_lock_status;
    }

    public void setUser_lock_status(String user_lock_status) {
        this.user_lock_status = user_lock_status;
    }

    public Date getUser_reg_date() {
        return user_reg_date;
    }

    public void setUser_reg_date(Date user_reg_date) {
        this.user_reg_date = user_reg_date;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "user_seq=" + user_seq +
                ", user_id='" + user_id + '\'' +
                ", user_pw='" + user_pw + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_dob='" + user_dob + '\'' +
                ", uesr_login_count=" + uesr_login_count +
                ", user_level=" + user_level +
                ", uesr_del_flag='" + uesr_del_flag + '\'' +
                ", user_lock_status='" + user_lock_status + '\'' +
                ", user_reg_date=" + user_reg_date +
                '}';
    }
}
