package com.alpcashierin.cashierin.entity;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {
    LocalDate date;
    LocalDateTime starttime;
    LocalDateTime endtime;

    public Transaction(LocalDate date, LocalDateTime starttime, LocalDateTime endtime) {
        this.date = date;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }
}
