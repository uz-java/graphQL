package com.example.graphql.controller.author;

import com.example.graphql.domans.author.Author;
import com.example.graphql.dtos.author.AuthorCreateDTO;
import com.example.graphql.service.author.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public List<Author> findAll(){
        return service.findAll();
    }
    @PostMapping("/register")
    public Long register(@RequestBody AuthorCreateDTO dto){
        return service.register(dto);
    }

}
