package com.example.graphql.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author "Tojaliyev Asliddin"
 * @since 13/10/22 18:29 (Thursday)
 * graphQL/IntelliJ IDEA
 */
public enum Rating {
    FIVE_STARS("⭐️⭐️⭐️⭐️⭐️️️️", "5"),
    FOUR_STARS("⭐️⭐️⭐️⭐️", "4"),
    THREE_STARS("⭐️⭐️⭐️", "3"),
    TWO_STARS("⭐️⭐️", "2"),
    ONE_STAR("⭐️", "1");

    private String star;
    private String rating;

    Rating(String star, String rating) {
        this.star = star;
        this.rating = rating;
    }

    @JsonValue
    public String getStar(){
        return star;
    }
}
