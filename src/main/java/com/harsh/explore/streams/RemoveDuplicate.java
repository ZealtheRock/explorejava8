package com.harsh.explore.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> aList= Arrays.asList(1,2,3,4,4,5,5,5,7,7,7,8,9,10);
        List<Integer>unique= aList.stream().distinct()
                .collect(Collectors.toList());

        System. out.println("Unique :"+unique);

        List<Integer> unique1= new ArrayList<>();
        for(Integer inte:aList){
            if(!unique1.contains(inte)){
                unique1.add(inte);
            }
        }
        System.out.println("Unique1 :" +unique1);
    }


}
