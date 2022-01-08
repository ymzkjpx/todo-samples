package com.todo.domain.model.keyword;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 書籍名, 著者名, 書籍番号などを持つ曖昧な検索語
 */
public class Keyword {
    @NotNull
    @NotBlank
    String value;

    @Deprecated
    Keyword() {
    }

    private Keyword(String value) {
        this.value = value;
    }

    public static Keyword from(String value) {
        return new Keyword(value);
    }

    public static Keyword empty() {
        return new Keyword();
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "value='" + value + '\'' +
                '}';
    }
}
