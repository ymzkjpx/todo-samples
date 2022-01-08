package com.todo.domain.model.book;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 書籍のタイトル
 */
public class Title {
    @NotBlank
    @NotEmpty
    @NotNull
    String value;

    @Deprecated
    Title() {
    }

    public Title(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "Title{" +
                "value='" + value + '\'' +
                '}';
    }
}
