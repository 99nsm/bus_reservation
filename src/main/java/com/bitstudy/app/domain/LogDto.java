package com.bitstudy.app.domain;

import java.util.Date;

public class LogDto {
    private int log_seq;
    private String log_id;
    private String log_event_name;
    private Date log_date;
    private String log_ip;


    public int getLog_seq() {
        return log_seq;
    }

    public void setLog_seq(int log_seq) {
        this.log_seq = log_seq;
    }

    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public String getLog_event_name() {
        return log_event_name;
    }

    public void setLog_event_name(String log_event_name) {
        this.log_event_name = log_event_name;
    }

    public Date getLog_date() {
        return log_date;
    }

    public void setLog_date(Date log_date) {
        this.log_date = log_date;
    }

    public String getLog_ip() {
        return log_ip;
    }

    public void setLog_ip(String log_ip) {
        this.log_ip = log_ip;
    }


    @Override
    public String toString() {
        return "LogDto{" +
                "log_seq=" + log_seq +
                ", log_id='" + log_id + '\'' +
                ", log_event_name='" + log_event_name + '\'' +
                ", log_date=" + log_date +
                ", log_ip='" + log_ip + '\'' +
                '}';
    }
}
