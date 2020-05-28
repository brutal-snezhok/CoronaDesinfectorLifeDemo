package com.tsyrulik.config;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> ifc);
}
