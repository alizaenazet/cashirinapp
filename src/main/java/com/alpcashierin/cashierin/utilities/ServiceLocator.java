package com.alpcashierin.cashierin.utilities;


import java.util.HashMap;
import java.util.Map;
public class ServiceLocator {
    private static ServiceLocator instance;
    private Map<Class<?>, Object> services;

    private ServiceLocator() {
        services = new HashMap<>();
    }

    public static synchronized ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator();
        }
        return instance;
    }

    public <T> void registerService(Class<T> serviceInterface, T serviceImpl) {
        services.put(serviceInterface, serviceImpl);
    }

    public <T> T getService(Class<T> serviceInterface) {
        Object service = services.get(serviceInterface);
        if (service == null) {
            throw new IllegalArgumentException("Service not found for interface: " + serviceInterface.getName());
        }
        return serviceInterface.cast(service);
    }
}
