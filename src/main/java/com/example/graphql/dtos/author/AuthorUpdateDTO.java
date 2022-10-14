package com.example.graphql.dtos.author;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:38 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorUpdateDTO {
    private Integer id;
    private String firstName;
    private String lastName;
}
