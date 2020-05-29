package com.tsyrulik.recommendator.impl;

import com.tsyrulik.annotation.InjectProperty;
import com.tsyrulik.annotation.Singleton;
import com.tsyrulik.recommendator.Recommendator;

@Singleton
public class RecommendatorImpl implements Recommendator {

    @InjectProperty("wisky")
    private String alcohol;

    public RecommendatorImpl() {
        System.out.println("recommendator was created");
    }

    @Override
    public void recommend() {
        System.out.println("to protect from covid-2019, drink " + alcohol);
    }
}
