package com.fastcampus.springpractice.logic;

import org.springframework.stereotype.Service;

import java.util.List;
public interface Sort<T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
