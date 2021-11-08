package com.todo.domain.model.book;

/**
 * 著者名
 */
public class WorkOf {
    String value;

    @Deprecated
    WorkOf() {
    }

    public WorkOf(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "WorkOf{" +
                "value='" + value + '\'' +
                '}';
    }
}
