package com.tsyrulik.configurator.impl;

import com.tsyrulik.annotation.InjectByType;
import com.tsyrulik.configurator.ObjectConfigurator;
import com.tsyrulik.context.ApplicationContext;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {

    @Override
    @SneakyThrows
    public void configure(Object t, ApplicationContext context) {
        for(Field field : t.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                Object object = context.getObject(field.getType());
                field.set(t, object);
            }
        }

    }
}
