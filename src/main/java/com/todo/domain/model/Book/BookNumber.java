package com.todo.domain.model.Book;

import java.util.UUID;

/**
 * 書籍種番号
 */
public class BookNumber {
    UUID value;

    @Deprecated
    BookNumber() {
    }

    private BookNumber(UUID value) {
        this.value = value;
    }

    public static BookNumber from(UUID uuid){
        return new BookNumber(uuid);
    }

    public static BookNumber fromString(String uuidAsText){
        return new BookNumber(UUID.fromString(uuidAsText));
    }

    public UUID value() {
        return value;
    }

    @Override
    public String toString() {
        return "BookNumber{" +
                "value='" + value + '\'' +
                '}';
    }
}
