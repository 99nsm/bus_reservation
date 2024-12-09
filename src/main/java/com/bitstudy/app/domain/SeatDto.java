package com.bitstudy.app.domain;

import java.util.Date;

public class SeatDto {
    private int seat_seq;
    private int seat_time_seq;
    private String seat_value;
    private String seat_buy_id;
    private Date seat_buy_date;

    public int getSeat_seq() {
        return seat_seq;
    }

    public void setSeat_seq(int seat_seq) {
        this.seat_seq = seat_seq;
    }

    public int getSeat_time_seq() {
        return seat_time_seq;
    }

    public void setSeat_time_seq(int seat_time_seq) {
        this.seat_time_seq = seat_time_seq;
    }

    public String getSeat_value() {
        return seat_value;
    }

    public void setSeat_value(String seat_value) {
        this.seat_value = seat_value;
    }

    public String getSeat_buy_id() {
        return seat_buy_id;
    }

    public void setSeat_buy_id(String seat_buy_id) {
        this.seat_buy_id = seat_buy_id;
    }

    public Date getSeat_buy_date() {
        return seat_buy_date;
    }

    public void setSeat_buy_date(Date seat_buy_date) {
        this.seat_buy_date = seat_buy_date;
    }

    @Override
    public String toString() {
        return "SeatDto{" +
                "seat_seq=" + seat_seq +
                ", seat_time_seq=" + seat_time_seq +
                ", seat_value='" + seat_value + '\'' +
                ", seat_buy_id='" + seat_buy_id + '\'' +
                ", seat_buy_date=" + seat_buy_date +
                '}';
    }
}
