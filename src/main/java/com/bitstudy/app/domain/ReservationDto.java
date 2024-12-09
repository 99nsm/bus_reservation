package com.bitstudy.app.domain;

import java.util.Date;

public class ReservationDto {
    private int reservation_seq;
    private String reservation_id;
    private int reservation_amount;
    private int reservation_bus_seq;
    private int reservation_time_seq;
    private int reservation_seat_num;
    private Date reservation_buy_date;
    private Date reservation_modify_date;
    private String reservation_del_flag;



    public int getReservation_seq() {
        return reservation_seq;
    }

    public void setReservation_seq(int reservation_seq) {
        this.reservation_seq = reservation_seq;
    }

    public String getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(String reservation_id) {
        this.reservation_id = reservation_id;
    }

    public int getReservation_amount() {
        return reservation_amount;
    }

    public void setReservation_amount(int reservation_amount) {
        this.reservation_amount = reservation_amount;
    }

    public int getReservation_bus_seq() {
        return reservation_bus_seq;
    }

    public void setReservation_bus_seq(int reservation_bus_seq) {
        this.reservation_bus_seq = reservation_bus_seq;
    }

    public int getReservation_time_seq() {
        return reservation_time_seq;
    }

    public void setReservation_time_seq(int reservation_time_seq) {
        this.reservation_time_seq = reservation_time_seq;
    }

    public int getReservation_seat_num() {
        return reservation_seat_num;
    }

    public void setReservation_seat_num(int reservation_seat_num) {
        this.reservation_seat_num = reservation_seat_num;
    }

    public Date getReservation_buy_date() {
        return reservation_buy_date;
    }

    public void setReservation_buy_date(Date reservation_buy_date) {
        this.reservation_buy_date = reservation_buy_date;
    }

    public Date getReservation_modify_date() {
        return reservation_modify_date;
    }

    public void setReservation_modify_date(Date reservation_modify_date) {
        this.reservation_modify_date = reservation_modify_date;
    }

    public String getReservation_del_flag() {
        return reservation_del_flag;
    }

    public void setReservation_del_flag(String reservation_del_flag) {
        this.reservation_del_flag = reservation_del_flag;
    }

    @Override
    public String toString() {
        return "ReservationDto{" +
                "reservation_seq=" + reservation_seq +
                ", reservation_id='" + reservation_id + '\'' +
                ", reservation_amount=" + reservation_amount +
                ", reservation_bus_seq=" + reservation_bus_seq +
                ", reservation_time_seq=" + reservation_time_seq +
                ", reservation_seat_num=" + reservation_seat_num +
                ", reservation_buy_date=" + reservation_buy_date +
                ", reservation_modify_date=" + reservation_modify_date +
                ", reservation_del_flag='" + reservation_del_flag + '\'' +
                '}';
    }
}
