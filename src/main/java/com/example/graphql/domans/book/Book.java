package com.example.graphql.domans.book;

import com.example.graphql.domans.author.Author;
import com.example.graphql.enums.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:25 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_book")
public class Book {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Integer pages;
    private Rating rating;

    @ManyToOne(targetEntity = Author.class, fetch = FetchType.LAZY)
    private Author author;
}
