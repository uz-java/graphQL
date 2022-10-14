package com.example.graphql.domans.author;

import com.example.graphql.domans.book.Book;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:25 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book_author")
public class Author {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;

    @OneToMany
    private List<Book> books;
    public Author(Integer id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
