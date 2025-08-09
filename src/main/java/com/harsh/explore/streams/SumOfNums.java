package com.harsh.explore.streams;

import java.util.stream.IntStream;

public class SumOfNums {
    public static void main(String[] args) {
        // get the sum of first 100 numbers
        int sum = IntStream.rangeClosed(0,100)
                .sum();
        System.out.println("Sum :"+ sum);
    }
}
