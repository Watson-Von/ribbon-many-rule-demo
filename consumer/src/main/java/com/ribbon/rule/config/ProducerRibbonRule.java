package com.ribbon.rule.config;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class ProducerRibbonRule implements IRule {

    private ILoadBalancer iLoadBalancer;

    @Override
    public Server choose(Object o) {
        List<Server> allServers = iLoadBalancer.getAllServers();
        return allServers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.iLoadBalancer = iLoadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.iLoadBalancer;
    }
}
