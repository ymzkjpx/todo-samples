package com.todo.presentation.web.book.register;

import com.todo.TodoDBTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@TodoDBTest
@AutoConfigureMockMvc
class BookRegisterControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @WithMockUser(username = "test", password = "testpassword", roles = "ROLE_TEST_USER")
    void 画面が表示できること() throws Exception{
        ResultActions resultActions = mockMvc.perform(get("/book/register/"));
        resultActions.andExpect(status().isOk());
    }
}