package com.todo.domain.model.book;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 著者名
 */
public class WorkOf {
    @NotNull
    @NotBlank
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
