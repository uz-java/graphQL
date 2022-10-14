package com.example.graphql.repository.book;

import com.example.graphql.domans.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:27 (Thursday)
 * graphQL/IntelliJ IDEA
 */
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findAllByAuthor_Id(Integer id);
}
