package com.spring.app;

import java.util.Map;

public class GoldRateInfo {

    private Map<Integer, Double> rateInfo;

    // Getter for rateInfo
    public Map<Integer, Double> getRateInfo() {
        return rateInfo;
    }

    // Setter for rateInfo
    public void setRateInfo(Map<Integer, Double> rateInfo) {
        this.rateInfo = rateInfo;
    }
    
    public void setrateinfoin(int goldCarat, double grams) {
    	this.rateInfo.put(goldCarat, grams);
    }

    // Method to calculate gold rate based on carat and grams
    public double calculateGoldRate(int goldCarat, double grams) {
        Double ratePerGram = rateInfo.get(goldCarat);
        if (ratePerGram != null) {
            return ratePerGram * grams;
        } else {
            throw new IllegalArgumentException("Invalid gold carat: " + goldCarat);
        }
    }
}
