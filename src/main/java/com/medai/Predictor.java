package com.medai;

public class Predictor {
    public String predictDiabetes(double glucose, int age) {
        if (glucose < 0 || age < 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (glucose > 140 && age > 40) {
            return "High Risk";
        } else if (glucose > 140) {
            return "Moderate Risk";
        }
        return "Low Risk";
    }
}