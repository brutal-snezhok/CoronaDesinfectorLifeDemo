package com.tsyrulik;

import com.tsyrulik.announcer.Announcer;
import com.tsyrulik.model.Room;
import com.tsyrulik.policeman.Policeman;

public class CoronaDesinfector {
    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

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
