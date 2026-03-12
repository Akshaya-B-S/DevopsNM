package com.medai;

import static org.junit.Assert.*;
import org.junit.Test;

public class PredictorTest {
    Predictor predictor = new Predictor();

    @Test
    public void testHighRisk() {
        assertEquals("High Risk", predictor.predictDiabetes(150, 45));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInput() {
        predictor.predictDiabetes(-1, 20);
    }
}