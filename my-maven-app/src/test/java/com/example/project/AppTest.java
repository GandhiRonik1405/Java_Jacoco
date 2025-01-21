package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetMessage_NullName() {
        App app = new App();
        String result = app.getMessage(null);
        assertEquals("Hello, Guest!", result);
    }

    @Test
    public void testGetMessage_EmptyName() {
        App app = new App();
        String result = app.getMessage("");
        assertEquals("Hello, Guest!", result);
    }

    @Test
    public void testGetMessage_ValidName() {
        App app = new App();
        String result = app.getMessage("John");
        assertEquals("Hello, John!", result);
    }
}
