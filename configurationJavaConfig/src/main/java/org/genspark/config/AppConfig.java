package org.genspark.config;

import org.genspark.Address;
import org.genspark.Phone;
import org.genspark.student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;



@Configuration
public class AppConfig {
    @Bean
    public student getStudent(){
        return new student(1, "James", Collections.singletonList(new Phone("714-231-5462")), new Address("Birmingham", "AL", "United States", "12345"));
    }
}
