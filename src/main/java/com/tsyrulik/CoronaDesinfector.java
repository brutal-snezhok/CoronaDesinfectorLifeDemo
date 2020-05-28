package com.tsyrulik;

import com.tsyrulik.announcer.Announcer;
import com.tsyrulik.announcer.impl.ConsoleAnnouncer;
import com.tsyrulik.model.Room;
import com.tsyrulik.policeman.Policeman;
import com.tsyrulik.policeman.impl.PolicemanImpl;

public class CoronaDesinfector {
    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

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
