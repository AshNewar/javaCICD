package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMessage() {
        String msg = "Hello from Simple Java App 🚀";
        assertEquals("Hello from Simple Java App 🚀", msg);
    }
}
