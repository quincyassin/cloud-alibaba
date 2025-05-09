package com.ricardo.cloudalibaba.service;


import jakarta.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Resource
    private DiscoveryClient discoveryClient;

    public void getInstant() {
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-alibaba");
        instances.forEach(serviceInstance -> {

        });
    }
}
