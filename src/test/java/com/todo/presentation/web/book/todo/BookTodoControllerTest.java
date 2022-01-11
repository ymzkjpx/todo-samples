package com.todo.presentation.web.book.todo;

import com.todo.TodoControllerTest;
import com.todo.TodoDBTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@TodoDBTest
@TodoControllerTest
@AutoConfigureMockMvc
class BookTodoControllerTest {

    @Autowired
    MockMvc mockMvc;

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

//    @Test
//    @WithMockUser(username = "test", password = "testpassword", roles = "TESTER")
//    void 登録できること() throws Exception {
//        String titleText = "test book name";
//        String workOfText = "test author";
//        String genreText = "test genre";
//        ResultActions resultActions = mockMvc.perform(
//                post("/book/todo/")
//                        .param("register", "登録")
//                        .param("title.value", titleText)
//                        .param("workOf.value", workOfText)
//                        .param("genre.value", genreText)
//        );
//        resultActions.andExpect(status().isOk());
//    }
}