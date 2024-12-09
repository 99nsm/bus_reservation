package com.bitstudy.app.domain;

import java.util.Date;

public class AlarmDto {
    private int alarm_seq;
    private String alarm_content;
    private String alarm_sender_id;
    private String alarm_receiver_id;
    private String alarm_check_flag;
    private Date alarm_sent_date;
    private String alarm_code;


    public int getAlarm_seq() {
        return alarm_seq;
    }

    public void setAlarm_seq(int alarm_seq) {
        this.alarm_seq = alarm_seq;
    }

    public String getAlarm_content() {
        return alarm_content;
    }

    public void setAlarm_content(String alarm_content) {
        this.alarm_content = alarm_content;
    }

    public String getAlarm_sender_id() {
        return alarm_sender_id;
    }

    public void setAlarm_sender_id(String alarm_sender_id) {
        this.alarm_sender_id = alarm_sender_id;
    }

    public String getAlarm_receiver_id() {
        return alarm_receiver_id;
    }

    public void setAlarm_receiver_id(String alarm_receiver_id) {
        this.alarm_receiver_id = alarm_receiver_id;
    }

    public String getAlarm_check_flag() {
        return alarm_check_flag;
    }

    public void setAlarm_check_flag(String alarm_check_flag) {
        this.alarm_check_flag = alarm_check_flag;
    }

    public Date getAlarm_sent_date() {
        return alarm_sent_date;
    }

    public void setAlarm_sent_date(Date alarm_sent_date) {
        this.alarm_sent_date = alarm_sent_date;
    }

    public String getAlarm_code() {
        return alarm_code;
    }

    public void setAlarm_code(String alarm_code) {
        this.alarm_code = alarm_code;
    }

    @Override
    public String toString() {
        return "AlarmDto{" +
                "alarm_seq=" + alarm_seq +
                ", alarm_content='" + alarm_content + '\'' +
                ", alarm_sender_id='" + alarm_sender_id + '\'' +
                ", alarm_receiver_id='" + alarm_receiver_id + '\'' +
                ", alarm_check_flag='" + alarm_check_flag + '\'' +
                ", alarm_sent_date=" + alarm_sent_date +
                ", alarm_code='" + alarm_code + '\'' +
                '}';
    }
}
