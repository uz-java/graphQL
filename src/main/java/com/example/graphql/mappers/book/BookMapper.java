package com.example.graphql.mappers.book;

import com.example.graphql.domans.book.Book;
import com.example.graphql.dtos.book.BookCreateDTO;
import org.mapstruct.Mapper;

/**
 * @author "Tojaliyev Asliddin"
 * @since 14/10/22 17:58 (Friday)
 * graphQL/IntelliJ IDEA
 */
@Mapper(componentModel = "spring")
public interface BookMapper {
    Book fromCreateDTO(BookCreateDTO dto);
    BookCreateDTO toDTO(Book book);
}
