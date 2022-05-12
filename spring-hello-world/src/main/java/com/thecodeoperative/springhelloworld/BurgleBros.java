package com.thecodeoperative.springhelloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BurgleBros implements BoardGame{
    @Override
    public String getName() {
        return "Burgle Bros";
    }
}
