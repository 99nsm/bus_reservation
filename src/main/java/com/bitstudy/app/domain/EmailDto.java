package com.bitstudy.app.domain;

import java.util.Date;

public class EmailDto {
    private int email_seq ;
    private String email_id ;
    private String email_code ;
    private Date email_sent_date ;
    private Date email_end_date ;
    private String email_value ;


    public int getEmail_seq() {
        return email_seq;
    }

    public void setEmail_seq(int email_seq) {
        this.email_seq = email_seq;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getEmail_code() {
        return email_code;
    }

    public void setEmail_code(String email_code) {
        this.email_code = email_code;
    }

    public Date getEmail_sent_date() {
        return email_sent_date;
    }

    public void setEmail_sent_date(Date email_sent_date) {
        this.email_sent_date = email_sent_date;
    }

    public Date getEmail_end_date() {
        return email_end_date;
    }

    public void setEmail_end_date(Date email_end_date) {
        this.email_end_date = email_end_date;
    }

    public String getEmail_value() {
        return email_value;
    }

    public void setEmail_value(String email_value) {
        this.email_value = email_value;
    }

    @Override
    public String toString() {
        return "EmailDto{" +
                "email_seq=" + email_seq +
                ", email_id='" + email_id + '\'' +
                ", email_code='" + email_code + '\'' +
                ", email_sent_date=" + email_sent_date +
                ", email_end_date=" + email_end_date +
                ", email_value='" + email_value + '\'' +
                '}';
    }
}
