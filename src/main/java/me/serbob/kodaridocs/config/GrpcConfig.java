package me.serbob.kodaridocs.config;

import me.serbob.kodaridocs.autogen.ApiDocGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

    @Bean
    public ApiDocGenerator apiDocGenerator() {
        return new ApiDocGenerator();
    }
}