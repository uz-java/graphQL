package com.example.graphql.dtos.author;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 19:19 (Thursday)
 * graphQL/IntelliJ IDEA
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorCreateDTO {
    private String firstname;
    private String lastname;
}
