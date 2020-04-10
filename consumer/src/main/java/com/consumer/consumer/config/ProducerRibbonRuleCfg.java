package com.consumer.consumer.config;

import com.ribbon.rule.config.ProducerRibbonRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "producer", configuration = ProducerRibbonRule.class)
public class ProducerRibbonRuleCfg {
}
