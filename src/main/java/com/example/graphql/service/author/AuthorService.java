package com.example.graphql.service.author;

import com.example.graphql.domans.author.Author;
import com.example.graphql.dtos.author.AuthorCreateDTO;
import com.example.graphql.mappers.author.AuthorMapper;
import com.example.graphql.repository.author.AuthorRepository;
import com.example.graphql.repository.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 19:12 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorMapper authorMapper;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public Long register(AuthorCreateDTO dto) {
        Author author = authorMapper.fromCreateDTO(dto);
        Author authorSave = authorRepository.save(author);
        return authorSave.getId();
    }

    @QueryMapping
    public List<Author> findAll() {
        List<Author> authors = authorRepository.findAll();
        for (Author author : authors) {
            author.setBooks(bookRepository.findAllByAuthor_Id(author.getId()));
        }
        return authors;
    }
}
