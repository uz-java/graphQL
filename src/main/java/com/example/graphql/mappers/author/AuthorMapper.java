package com.example.graphql.mappers.author;

import com.example.graphql.domans.author.Author;
import com.example.graphql.dtos.author.AuthorCreateDTO;
import org.mapstruct.Mapper;

/**
 * @author "Tojaliyev Asliddin"
 * @since 14/10/22 17:56 (Friday)
 * graphQL/IntelliJ IDEA
 */
@Mapper(componentModel = "spring")
public interface AuthorMapper {
    Author fromCreateDTO(AuthorCreateDTO dto);

    AuthorCreateDTO toDTO(Author author);
}
