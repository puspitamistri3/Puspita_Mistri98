package com.geekster.URLHitCounter.BeanManager;

import com.geekster.URLHitCounter.Entity.UrlHitCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {
    @Bean
    public List<UrlHitCounter> getUrlHitCounterList(){

        return new ArrayList<>();
    }
}
