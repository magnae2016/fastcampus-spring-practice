package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sut = new SortService(new BubbleSort<>());

    @Test
    void test() {
        List<String> actual = sut.doSort(Arrays.asList("3", "2", "1"));
        assertEquals(Arrays.asList("1", "2", "3"), actual);
    }
}