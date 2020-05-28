package com.tsyrulik;

public class CoronaDesinfector {

    public void start(Room room) {
        //todo сообщить всем присутствующим в комнате, о начале дезинфекции, и попросить всех разойтись
        //todo разогнать всех кто не вышел после объявления
        desinfect(room);
        //todo сообщить всем присутствующим в комнате, что они могут вернуться обртано
    }

    private void desinfect(Room room) {
        System.out.println("Корона изыди!");
    }
}
