package com.tsyrulik.policeman.impl;

import com.tsyrulik.annotation.InjectByType;
import com.tsyrulik.policeman.Policeman;
import com.tsyrulik.recommendator.Recommendator;

public class PolicemanImpl implements Policeman {
    @InjectByType
    private Recommendator recommendator;

    public void init() {
        System.out.println(recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("пиф паф, бах бах");
    }
}
