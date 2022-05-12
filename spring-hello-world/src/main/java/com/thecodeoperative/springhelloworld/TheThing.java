package com.thecodeoperative.springhelloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TheThing implements BoardGame{
    @Override
    public String getName() {
        return "The thing";
    }
}
