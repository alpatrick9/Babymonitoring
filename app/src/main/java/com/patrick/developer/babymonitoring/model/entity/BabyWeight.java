package com.patrick.developer.babymonitoring.model.entity;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by developer on 4/26/17.
 */

@DatabaseTable(tableName = "BABYWEIGHT")
public class BabyWeight implements Serializable {

    @DatabaseField(generatedId = true)
    protected Long id;

    @DatabaseField(columnName = "WEIGHT")
    protected Float weight;

    @DatabaseField(columnName = "MONTH", defaultValue = "0")
    protected Integer month;

    @DatabaseField(columnName = "OBS", canBeNull = true)
    protected String obs;

    @DatabaseField(columnName ="BABY_ID" ,foreign = true, canBeNull = true)
    protected Baby baby;

    public BabyWeight() {
    }

    public BabyWeight(Float weight, Integer month, Baby baby) {
        this.weight = weight;
        this.month = month;
        this.baby = baby;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }
}
