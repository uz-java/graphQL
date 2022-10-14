package com.example.graphql.service.book;

import com.example.graphql.domans.author.Author;
import com.example.graphql.domans.book.Book;
import com.example.graphql.dtos.book.BookCreateDTO;
import com.example.graphql.mappers.book.BookMapper;
import com.example.graphql.repository.author.AuthorRepository;
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
    private final AuthorRepository authorRepository;

    public Integer bookCreate(BookCreateDTO dto) {
        Book book = bookMapper.fromCreateDTO(dto);
        Author author = getAuthor(dto.getAuthorId());
        book.setAuthor(author);
        Book bookSave = bookRepository.save(book);
        return bookSave.getId();
    }


    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book getOne(Integer id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Book not found");
        });
        return book;
    }

    public Author getAuthor(Integer id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Author not found");
        });
        return author;
    }
}
