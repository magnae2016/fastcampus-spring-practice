package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        Sort<String> bubbleSort = new BubbleSort<>();
        System.out.println("[result] " + bubbleSort.sort(Arrays.asList(args)));
    }
}
