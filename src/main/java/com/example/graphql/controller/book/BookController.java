package com.example.graphql.controller.book;

import com.example.graphql.domans.author.Author;
import com.example.graphql.domans.book.Book;
import com.example.graphql.dtos.book.BookCreateDTO;
import com.example.graphql.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:29 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService service;

    @GetMapping
    @SchemaMapping(typeName = "Query", value = "allBooks")
    public List<Book> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    @QueryMapping
    public Book getOne(@Argument @PathVariable Integer id){
        return service.getOne(id);
    }
    @PostMapping("/bookCreate")
    public Integer bookCreate(@RequestBody BookCreateDTO dto){
        return service.bookCreate(dto);
    }

}
