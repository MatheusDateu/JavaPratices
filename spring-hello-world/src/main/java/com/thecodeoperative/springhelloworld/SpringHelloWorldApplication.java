package com.thecodeoperative.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringHelloWorldApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringHelloWorldApplication.class, args);
        BoardGame boardGame = applicationContext.getBean(BoardGame.class);
        System.out.println(boardGame.getName());
    }

}
