package com.todo.domain.model.book;

import java.util.UUID;

/**
 * 書籍種番号
 */
public class BookNumber {
    String value;

    @Deprecated
    BookNumber() {
    }

    private BookNumber(String value) {
        this.value = value;
    }

    public static BookNumber from(UUID uuid){
        return new BookNumber(uuid.toString());
    }

    public static BookNumber fromString(String uuidAsText){
        return new BookNumber(UUID.fromString(uuidAsText).toString());
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
