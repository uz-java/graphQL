package com.example.graphql;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class GraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQlApplication.class, args);
    }
}
