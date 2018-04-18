package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        Integer numbers[] = {15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9};
        List<Integer> list = new LinkedList<>(Arrays.asList(numbers));
        assertTrue(numbers.length == 12);
    }

    @Test
    public void partition2() {
        Integer list2[] = {1,-3, 4, 2, -1};
        assertNotNull(list2);
        assertTrue(list2.length == 5);
    }

    @Test
    public void partition1() {
        Integer list1[] = {15, 6, 12, 8, 21, 30, 9};
        assertNotNull(list1);
        assertTrue(list1.length == 7);


    }
}