package com.tsyrulik.factory;

import com.tsyrulik.configurator.ObjectConfigurator;
import com.tsyrulik.context.ApplicationContext;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class ObjectFactory {
    private final ApplicationContext context;
    private List<ObjectConfigurator> configurators = new ArrayList<>();

    @SneakyThrows
    public ObjectFactory(ApplicationContext context) {
        this.context = context;
        for(Class<? extends ObjectConfigurator> aClass : context.getConfig().getScanner().getSubTypesOf(ObjectConfigurator.class)) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> implClass) {
        T t = implClass.getDeclaredConstructor().newInstance();

        configurators.forEach(objectConfigurator -> objectConfigurator.configure(t, context));

        return t;
    }
}
