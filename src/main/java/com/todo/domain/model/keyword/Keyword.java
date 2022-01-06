package com.todo.domain.model.keyword;

/**
 * 書籍名, 著者名, 書籍番号などを持つ曖昧な検索語
 */
public class Keyword {
    String value;

    @Deprecated
    Keyword(){}

    private Keyword(String value) {
        this.value = value;
    }

    public static Keyword from(String value){
        return new Keyword(value);
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
