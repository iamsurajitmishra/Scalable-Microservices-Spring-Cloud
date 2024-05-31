package com.org.employeeservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    public WebClient webClient() {
//        return WebClient.builder().build();
//    }

//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
