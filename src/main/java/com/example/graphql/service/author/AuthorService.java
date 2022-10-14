package com.example.graphql.service.author;

import com.example.graphql.domans.author.Author;
import com.example.graphql.dtos.author.AuthorCreateDTO;
import com.example.graphql.dtos.author.AuthorUpdateDTO;
import com.example.graphql.mappers.author.AuthorMapper;
import com.example.graphql.repository.author.AuthorRepository;
import com.example.graphql.repository.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Objects;

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


    public Integer register(AuthorCreateDTO dto) {
        Author author = authorMapper.fromCreateDTO(dto);
        author.setFirstname(dto.getFirstname());
        author.setLastname(dto.getLastname());
        Author authorSave = authorRepository.save(author);
        return authorSave.getId();
    }

    public List<Author> findAll() {
        List<Author> authors = authorRepository.findAll();

        for (Author author : authors) {
            author.setBooks(bookRepository.findAllByAuthor_Id(author.getId()));
        }
        return authors;
    }

    public Author save(AuthorUpdateDTO dto) {
        Author author = authorRepository.findById(dto.getId()).orElseThrow(() -> {
            throw new RuntimeException("Author not found");
        });
        if (Objects.nonNull(dto.getFirstName()))
            author.setFirstname(dto.getFirstName());
        if (Objects.nonNull(dto.getLastName()))
            author.setLastname(dto.getLastName());
        authorRepository.save(author);
        return author;
    }
}
