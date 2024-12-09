package com.bitstudy.app.domain;

import java.util.Date;

public class TerminalDto {
    private int terminal_seq;
    private String terminal_area;
    private String terminal_name;
    private String terminal_del_flag;
    private String terminal_reg_id;
    private Date terminal_reg_date;
    private String terminal_modify_id;
    private Date terminal_modify_date;


    public int getTerminal_seq() {
        return terminal_seq;
    }

    public void setTerminal_seq(int terminal_seq) {
        this.terminal_seq = terminal_seq;
    }

    public String getTerminal_area() {
        return terminal_area;
    }

    public void setTerminal_area(String terminal_area) {
        this.terminal_area = terminal_area;
    }

    public String getTerminal_name() {
        return terminal_name;
    }

    public void setTerminal_name(String terminal_name) {
        this.terminal_name = terminal_name;
    }

    public String getTerminal_del_flag() {
        return terminal_del_flag;
    }

    public void setTerminal_del_flag(String terminal_del_flag) {
        this.terminal_del_flag = terminal_del_flag;
    }

    public String getTerminal_reg_id() {
        return terminal_reg_id;
    }

    public void setTerminal_reg_id(String terminal_reg_id) {
        this.terminal_reg_id = terminal_reg_id;
    }

    public Date getTerminal_reg_date() {
        return terminal_reg_date;
    }

    public void setTerminal_reg_date(Date terminal_reg_date) {
        this.terminal_reg_date = terminal_reg_date;
    }

    public String getTerminal_modify_id() {
        return terminal_modify_id;
    }

    public void setTerminal_modify_id(String terminal_modify_id) {
        this.terminal_modify_id = terminal_modify_id;
    }

    public Date getTerminal_modify_date() {
        return terminal_modify_date;
    }

    public void setTerminal_modify_date(Date terminal_modify_date) {
        this.terminal_modify_date = terminal_modify_date;
    }

    @Override
    public String toString() {
        return "TerminalDto{" +
                "terminal_seq=" + terminal_seq +
                ", terminal_area='" + terminal_area + '\'' +
                ", terminal_name='" + terminal_name + '\'' +
                ", terminal_del_flag='" + terminal_del_flag + '\'' +
                ", terminal_reg_id='" + terminal_reg_id + '\'' +
                ", terminal_reg_date=" + terminal_reg_date +
                ", terminal_modify_id='" + terminal_modify_id + '\'' +
                ", terminal_modify_date=" + terminal_modify_date +
                '}';
    }
}
