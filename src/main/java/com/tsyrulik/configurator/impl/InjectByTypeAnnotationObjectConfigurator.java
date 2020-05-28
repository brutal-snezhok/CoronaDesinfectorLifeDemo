package com.tsyrulik.configurator.impl;

import com.tsyrulik.ObjectFactory;
import com.tsyrulik.annotation.InjectByType;
import com.tsyrulik.configurator.ObjectConfigurator;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {

    @Override
    @SneakyThrows
    public void configure(Object t) {
        for(Field field : t.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                Object object = ObjectFactory.getInstance().createObject(field.getType());
                field.set(t, object);
            }
        }

    }
}
