package com.tsyrulik.policeman.impl;

import com.tsyrulik.policeman.Policeman;

public class AngryPoliceman implements Policeman {
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Всех убъю! Вон пошли!");
    }
}
