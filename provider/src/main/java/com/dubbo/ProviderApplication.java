package com.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableDubbo
@EnableDubbo(scanBasePackages ="com.dubbo.impl")
@SpringBootApplication
public class ProviderApplication {

    //private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");

    public static void main(String[] args)  {
        // ServiceConfig<TestServiceImpl> service = new ServiceConfig<>();
        // service.setApplication(new ApplicationConfig("first-dubbo-provider"));
        // service.setRegistry(new RegistryConfig("zookeeper://" + zookeeperHost + ":2181"));
        // service.setInterface(ProviderConfiguration.class);
        // service.setRef(new TestServiceImpl());
        // service.export();
        //
        // System.out.println("dubbo service started");
        // new CountDownLatch(1).await();
        SpringApplication.run(ProviderApplication.class, args);
    }
}
