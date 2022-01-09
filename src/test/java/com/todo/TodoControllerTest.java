package com.todo;

import org.springframework.security.test.context.support.WithMockUser;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithMockUser(username = "test", password = "testpassword", roles = "TEST_USER")
public @interface TodoControllerTest {
}
