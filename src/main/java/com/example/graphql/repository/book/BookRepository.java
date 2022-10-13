package com.example.graphql.repository.book;

import com.example.graphql.domans.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:27 (Thursday)
 * graphQL/IntelliJ IDEA
 */
public interface BookRepository extends JpaRepository<Book,Integer> {

}
