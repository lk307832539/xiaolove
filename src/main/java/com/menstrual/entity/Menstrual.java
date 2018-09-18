package com.menstrual.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by LK on 9/18/2018.
 */
@Entity
public class Menstrual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menstrualId;

    private Date startDate;

    private int interval;

    public Menstrual() {
    }

    public int getMenstrualId() {
        return menstrualId;
    }

    public void setMenstrualId(int menstrualId) {
        this.menstrualId = menstrualId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
