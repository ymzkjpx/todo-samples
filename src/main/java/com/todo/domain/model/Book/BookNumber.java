package com.todo.domain.model.Book;

/**
 * 書籍種番号
 */
public class BookNumber {
    String value;

    @Deprecated
    BookNumber(){}

    private BookNumber(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "BookNumber{" +
                "value='" + value + '\'' +
                '}';
    }
}
