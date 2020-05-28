package com.tsyrulik.announcer.impl;

import com.tsyrulik.announcer.Announcer;

public class ConsoleAnnouncer implements Announcer {
    @Override
    public void announce(String message) {
        System.out.println(message);
    }
}
