package com.mk.docker.dockerprocess.bootstrap;

import com.mk.docker.dockerprocess.domain.Product;
import com.mk.docker.dockerprocess.service.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    ProductServiceImpl productService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.info("Bootstrap : Insert data");

        Product p = new Product();
        p.setName("Hammer");
        p.setDescription("Hammer super cool");
        productService.save(p);

    }
}
