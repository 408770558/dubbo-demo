package com.dubbo.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/8/27
 * 说明：
 */
@Configuration
// @EnableDubbo(scanBasePackages = "com.dubbo.service.impl")
// @PropertySource("classpath:/dubbo-provider.yml")
public class ProviderConfiguration {

    // @Bean
    // public ProviderConfig providerConfig() {
    //     ProviderConfig providerConfig = new ProviderConfig();
    //     providerConfig.setTimeout(1000);
    //     return providerConfig;
    // }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("samples-annotation-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");return registryConfig;
    }
}
