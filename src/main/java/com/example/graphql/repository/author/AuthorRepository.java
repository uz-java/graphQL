package com.example.graphql.repository.author;

import com.example.graphql.domans.author.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:27 (Thursday)
 * graphQL/IntelliJ IDEA
 */
public interface AuthorRepository extends JpaRepository<Author,Long> {

}
