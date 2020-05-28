package com.tsyrulik.recommendator.impl;

import com.tsyrulik.recommendator.InjectProperty;
import com.tsyrulik.recommendator.Recommendator;

public class RecommendatorImpl implements Recommendator {

    @InjectProperty("wisky")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from covid-2019, drink " + alcohol);
    }
}
