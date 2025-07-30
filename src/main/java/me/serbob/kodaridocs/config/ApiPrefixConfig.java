package me.serbob.kodaridocs.config;

import me.serbob.kodaridocs.annotations.ApiV1Controller;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApiPrefixConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix("/api/v1",
                handlerType -> handlerType.isAnnotationPresent(ApiV1Controller.class));
    }
}
