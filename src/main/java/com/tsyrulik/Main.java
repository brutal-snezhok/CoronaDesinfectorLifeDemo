package com.tsyrulik;

import com.tsyrulik.context.Application;
import com.tsyrulik.context.ApplicationContext;
import com.tsyrulik.model.Room;
import com.tsyrulik.policeman.AngryPoliceman;
import com.tsyrulik.policeman.Policeman;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // CoronaDesinfector desinfector = ObjectFactory.getInstance().createObject(CoronaDesinfector.class);
        ApplicationContext context = Application.run("com.tsyrulik", new HashMap<>(Map.of(Policeman.class, AngryPoliceman.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}
