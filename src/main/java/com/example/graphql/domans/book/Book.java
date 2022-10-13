package com.example.graphql.domans.book;

import com.example.graphql.enams.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:25 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    private Integer id;
    private String title;
    private Integer pages;
    private Rating rating;
}
