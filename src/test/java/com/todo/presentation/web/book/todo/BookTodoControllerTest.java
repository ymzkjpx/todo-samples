package com.todo.presentation.web.book.todo;

import com.todo.TodoControllerTest;
import com.todo.TodoDBTest;
import com.todo.application.book.BookSearchService;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.keyword.Keyword;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@TodoDBTest
@TodoControllerTest
@AutoConfigureMockMvc
@ContextConfiguration
class BookTodoControllerTest {

    @Autowired
    private WebApplicationContext context;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    BookSearchService bookSearchService;

    @Test
    void 画面が表示できること() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/book/todo/"));
        resultActions.andExpect(status().isOk());
    }

    @Test
    void 検索できること() throws Exception {
        String keywordText = "1984";
        ResultActions resultActions = mockMvc.perform(
                post("/book/todo/")
                        .param("search", "")
                        .param("value", keywordText)
        );
        resultActions
                .andExpect(status().isOk())
                .andExpect(view().name("book/todo/todo"));
    }

    @Test
    @WithMockUser(username = "test", password = "testpassword", roles = "TESTER")
    void 登録できること() throws Exception {
        String titleText = "test book name";
        String workOfText = "test author";
        String genreText = "test genre";
        ResultActions resultActions = mockMvc.perform(
                post("/book/todo/")
                        .param("register", "登録")
                        .param("title.value", titleText)
                        .param("workOf.value", workOfText)
                        .param("genre.value", genreText)
        );
        resultActions.andExpect(status().is3xxRedirection());

        Books result = bookSearchService.searchBooks(Keyword.from(titleText));
        assertAll(
                () -> assertEquals(1, result.asList().size())
                , () -> assertTrue(titleText.equals(result.asList().get(0).title().value()))
                , () -> assertTrue(workOfText.equals(result.asList().get(0).workOf().value()))
                , () -> assertTrue(genreText.equals(result.asList().get(0).genre().value()))
        );
    }
}