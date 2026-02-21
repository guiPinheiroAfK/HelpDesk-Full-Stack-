package com.github.guipinheiroafk.helpdesk;

import com.github.guipinheiroafk.helpdesk.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelpdeskBackendApplication implements CommandLineRunner {

    @Autowired
    private DBService dbService;

    public static void main(String[] args) {
        SpringApplication.run(HelpdeskBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dbService.instanciaBaseDeDados();
    }
}