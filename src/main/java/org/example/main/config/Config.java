package org.example.main.config;

import org.example.main.service.Password;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.main") //this annotation is used we are working on only annotation absed spring bean creation only check in Main class for annotation based configuration
public class Config {
    public Config(){
        System.out.println("Config bean is created ...");
    }
    @Bean
    public Password createPass(){
        return new Password("SKA");
    }
}
