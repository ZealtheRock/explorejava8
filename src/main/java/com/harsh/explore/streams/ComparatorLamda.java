package com.harsh.explore.streams;

import java.util.Comparator;

public class ComparatorLamda {
    public static void main(String[] args) {
        // Lambda style use of comprator
        Comparator<Integer> comparator = (a, b) ->a.compareTo(b);
        System.out.println("Comparison : "+ comparator.compare(2,3));
    }
}
