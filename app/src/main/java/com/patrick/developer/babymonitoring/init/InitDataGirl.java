package com.patrick.developer.babymonitoring.init;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 4/26/17.
 */

public class InitDataGirl {
    protected List<Double> sizeMin;
    protected List<Double> sizeMax;

    protected List<Double> weightMin;
    protected List<Double> weightMax;

    public InitDataGirl() {
        sizeMin = new ArrayList<>();
        sizeMax = new ArrayList<>();
        weightMin = new ArrayList<>();
        weightMax = new ArrayList<>();

        /** a la naissance **/
        sizeMin.add(2.6);
        sizeMax.add(4.0);
        weightMin.add(45.0);
        weightMax.add(55.0);

        /** 1 mois **/
        sizeMin.add(2.8);
        sizeMax.add(4.6);
        weightMin.add(48.5);
        weightMax.add(55.0);

        /** 2 mois **/
        sizeMin.add(3.7);
        sizeMax.add(5.5);
        weightMin.add(52.0);
        weightMax.add(60.0);

        /** 3 mois **/
        sizeMin.add(4.3);
        sizeMax.add(5.5);
        weightMin.add(54.5);
        weightMax.add(62.0);

        /** 4 mois **/
        sizeMin.add(4.7);
        sizeMax.add(7.3);
        weightMin.add(57.0);
        weightMax.add(65.0);

        /** 5 mois **/
        sizeMin.add(5.0);
        sizeMax.add(8.0);
        weightMin.add(59.0);
        weightMax.add(67.5);

        /** 6 mois **/
        sizeMin.add(5.5);
        sizeMax.add(8.7);
        weightMin.add(60.5);
        weightMax.add(69.5);

        /** 1 an **/
        sizeMin.add(7.3);
        sizeMax.add(11.2);
        weightMin.add(67.8);
        weightMax.add(77.5);
    }

    public List<Double> getSizeMin() {
        return sizeMin;
    }

    public void setSizeMin(List<Double> sizeMin) {
        this.sizeMin = sizeMin;
    }

    public List<Double> getSizeMax() {
        return sizeMax;
    }

    public void setSizeMax(List<Double> sizeMax) {
        this.sizeMax = sizeMax;
    }

    public List<Double> getWeightMin() {
        return weightMin;
    }

    public void setWeightMin(List<Double> weightMin) {
        this.weightMin = weightMin;
    }

    public List<Double> getWeightMax() {
        return weightMax;
    }

    public void setWeightMax(List<Double> weightMax) {
        this.weightMax = weightMax;
    }
}