package com.consumer.consumer.config;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "user", configuration = RandomRule.class)
public class UserRibbonRuleCfg {
}
