package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        assertEquals(5, a + b, "2 + 3 should equal 5");
    }
}
