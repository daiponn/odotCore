package com.makotojava.learn.odot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.makotojava.learn.odot")
public abstract class AbstractApplicationConfiguration implements DatabaseConfiguration {
}
