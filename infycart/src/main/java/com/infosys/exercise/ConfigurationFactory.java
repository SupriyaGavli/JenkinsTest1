package com.infosys.exercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Beans of application are getting instantiated
@Configuration
public class ConfigurationFactory {
    @Bean
    public Employee employee()  {
        return new Employee();
    }
}