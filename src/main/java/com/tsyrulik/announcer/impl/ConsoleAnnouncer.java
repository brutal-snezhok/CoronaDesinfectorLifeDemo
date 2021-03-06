package com.tsyrulik.announcer.impl;

import com.tsyrulik.annotation.InjectByType;
import com.tsyrulik.announcer.Announcer;
import com.tsyrulik.recommendator.Recommendator;

public class ConsoleAnnouncer implements Announcer {

    @InjectByType
    private Recommendator recommendator;

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
