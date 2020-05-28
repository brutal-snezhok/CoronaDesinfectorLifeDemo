package com.tsyrulik;

import com.tsyrulik.annotation.InjectByType;
import com.tsyrulik.announcer.Announcer;
import com.tsyrulik.model.Room;
import com.tsyrulik.policeman.Policeman;

public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вон!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Рискните зайти обратно");
    }

    private void desinfect(Room room) {
        System.out.println("Корона изыди!");
    }
}
