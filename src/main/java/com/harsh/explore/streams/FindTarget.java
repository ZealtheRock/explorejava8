package com.harsh.explore.streams;

import java.util.HashMap;
import java.util.Map;

public class FindTarget {
    /* Find the target of the set that adds up to the
     given target
    * */
    static HashMap<Integer, Integer> intMap = new HashMap<>();
    static Map<Integer, Integer> pair = new HashMap<>();

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 7, 8};
        int target = 9;
        for (int i = 0; i <= numbers.length - 1; i++) {
            intMap.put(numbers[i], i);
        }
        //find the pair
        //getThePair(intMap, target);
        System. out.println("Map :" + intMap);
        // System.out.println("Pair " + pair);
    }

    private static int[] getThePair(HashMap<Integer, Integer> intMap, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i <= intMap.size(); i++) {
            int indexChk = target - i;
            if (myMap.containsValue(indexChk)) {
                return new int[]{myMap.get(indexChk), i};
            }
            myMap.put(intMap.get(i), i);
        }
        return new int[]{-1, -1};
    }
}
