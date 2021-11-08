package com.todo.domain.model.book;

/**
 * 書籍のタイトル
 */
public class Title {
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
