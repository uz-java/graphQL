package com.example.graphql.controller.author;

import com.example.graphql.domans.author.Author;
import com.example.graphql.dtos.author.AuthorCreateDTO;
import com.example.graphql.dtos.author.AuthorUpdateDTO;
import com.example.graphql.service.author.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:29 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService service;

    @GetMapping
    @SchemaMapping(typeName = "Query", value = "allAuthors")
    public List<Author> allAuthors(){
        return service.findAll();
    }
    @MutationMapping
    @PostMapping("/register")
    public Integer register(@RequestBody AuthorCreateDTO dto){
        return service.register(dto);
    }

    @MutationMapping
    @PostMapping("/update")
    public Author updateAuthor(@Argument AuthorUpdateDTO dto){
        return service.save(dto);
    }

}
