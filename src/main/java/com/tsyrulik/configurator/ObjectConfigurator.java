package com.tsyrulik.configurator;

import com.tsyrulik.context.ApplicationContext;

public interface ObjectConfigurator {
    void configure(Object t, ApplicationContext context);
}
