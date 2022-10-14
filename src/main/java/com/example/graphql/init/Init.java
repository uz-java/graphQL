package com.example.graphql.init;

import com.example.graphql.domans.author.Author;
import com.example.graphql.domans.book.Book;
import com.example.graphql.enums.Rating;
import com.example.graphql.repository.author.AuthorRepository;
import com.example.graphql.repository.book.BookRepository;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:26 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Component
public class Init implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        AuthorRepository authorRepository = applicationContext.getBean(AuthorRepository.class);
        BookRepository bookRepository = applicationContext.getBean(BookRepository.class);

        authorRepository.deleteAll();
        bookRepository.deleteAll();

        Author josh = new Author(1, "Josh", "Long");
        Author mark = new Author(2, "Mark", "Heckler");
        Author greg = new Author(3, "Greg", "Turnquist");

        authorRepository.saveAllAndFlush(Arrays.asList(josh, mark, greg));

        bookRepository.saveAll(
                List.of(
                        new Book(1, "Reactive Spring", 484, Rating.TWO_STARS, josh),
                        new Book(2, "Spring Boot Up & Running", 328, Rating.ONE_STAR, mark),
                        new Book(3, "Hacking with Spring Boot 2.3", 392, Rating.FIVE_STARS, greg)
                )
        );

    }
}
