package com.menstrual.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by LK on 9/18/2018.
 */
@Entity
public class MenstrualAvg {
    @Id
    private int minInterval;

    private int maxInterval;

    private int avgInterval;

    public MenstrualAvg() {
    }

    public int getMinInterval() {
        return minInterval;
    }

    public void setMinInterval(int minInterval) {
        this.minInterval = minInterval;
    }

    public int getMaxInterval() {
        return maxInterval;
    }

    public void setMaxInterval(int maxInterval) {
        this.maxInterval = maxInterval;
    }

    public int getAvgInterval() {
        return avgInterval;
    }

    public void setAvgInterval(int avgInterval) {
        this.avgInterval = avgInterval;
    }
}
