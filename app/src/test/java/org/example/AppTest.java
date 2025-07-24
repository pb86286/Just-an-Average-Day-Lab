package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    int[] nums = {5, 3, 8, 2, 7};

    @Test
    void testMaximumUsingForLoop() {
        assertEquals(8, App.maximumUsingForLoop(nums));
    }

    @Test
    void testMinimumUsingForLoop() {
        assertEquals(2, App.minimumUsingForLoop(nums));
    }

    @Test
    void testSumUsingForLoop() {
        assertEquals(25, App.sumUsingForLoop(nums));
    }

    @Test
    void testAverageUsingForLoop() {
        assertEquals(5, App.averageUsingForLoop(nums));
    }

    @Test
    void testMaximumUsingStream() {
        assertEquals(8, App.maximumUsingStream(nums));
    }

    @Test
    void testMinimumUsingStream() {
        assertEquals(2, App.minimumUsingStream(nums));
    }

    @Test
    void testSumUsingStream() {
        assertEquals(25, App.sumUsingStream(nums));
    }

    @Test
    void testAverageUsingStream() {
        assertEquals(5, App.averageUsingStream(nums));
    }
}