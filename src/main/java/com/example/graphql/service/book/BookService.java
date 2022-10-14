package com.example.graphql.service.book;

import com.example.graphql.domans.book.Book;
import com.example.graphql.dtos.book.BookCreateDTO;
import com.example.graphql.mappers.book.BookMapper;
import com.example.graphql.repository.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 19:13 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class BookService {
    private final BookMapper bookMapper;
    private final BookRepository bookRepository;
    public Long bookCreate(BookCreateDTO dto) {
        Book book = bookMapper.fromCreateDTO(dto);
        Book bookSave = bookRepository.save(book);
        return bookSave.getId();
    }


    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
