package br.com.firstspringprojectf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteideaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteideaApplication.class, args);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Servidor inicializado com sucesso");
        System.out.println("-------------------------------------------------------------------");
    }
}