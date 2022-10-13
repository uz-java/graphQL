package com.example.graphql.domans.book;

import com.example.graphql.enams.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
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
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Integer pages;
    private Rating rating;

    @CreatedDate
    @CreationTimestamp
    @Column(columnDefinition = "timestamp default current_timestamp")
    private Timestamp createdAt;
}
