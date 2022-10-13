package com.example.graphql.dtos.book;

import com.example.graphql.enams.Rating;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 19:19 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookCreateDTO {
    private String title;
    private Integer pages;
    @Enumerated(EnumType.STRING)
    private Rating rating;
}
