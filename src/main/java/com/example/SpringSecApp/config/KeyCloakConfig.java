package com.example.SpringSecApp.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//we add this cause SpringBoot needs it to run, info here:
//https://stackoverflow.com/questions/57787768/issues-running-example-keycloak-spring-boot-app
public class KeyCloakConfig {

    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}


