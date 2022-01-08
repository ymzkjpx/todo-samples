package com.todo.domain.model.book;

import org.springframework.lang.NonNull;

import java.util.UUID;

import javax.validation.constraints.NotNull;

/**
 * 書籍種番号
 */
public class BookNumber {
    @NotNull
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

    public static BookNumber generate(){
        return BookNumber.from(UUID.randomUUID());
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
