package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DummySecondTest {

    @Test
    void testAdditionAlwaysPasses() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testStringIsNotNull() {
        String str = "Spring Boot";
        assertNotNull(str);
    }

    @Test
    void testBooleanAlwaysTrue() {
        assertTrue(true);
    }

    @Test
    void testEmptyListHasSizeZero() {
        java.util.List<String> list = new java.util.ArrayList<>();
        assertEquals(0, list.size());
    }

    @Test
    void testArrayLengthIsCorrect() {
        int[] array = new int[5];
        assertEquals(5, array.length);
    }
}
