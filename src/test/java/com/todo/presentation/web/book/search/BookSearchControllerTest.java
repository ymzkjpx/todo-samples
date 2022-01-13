package com.todo.presentation.web.book.search;

import com.todo.TodoDBTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@TodoDBTest
@AutoConfigureMockMvc
class BookSearchControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void 画面が表示できること() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/book/search/"));
        resultActions.andExpect(status().isOk())
                .andExpect(view().name("book/search/search"));
    }

    @Test
    void 検索できること() throws Exception {
        String keywordText = "1984";
        ResultActions resultActions = mockMvc.perform(
                post("/book/search/")
                        .param("search", "")
                        .param("value", keywordText)
        );
        resultActions
                .andExpect(status().isOk())
                .andExpect(view().name("book/search/search"));
    }

}