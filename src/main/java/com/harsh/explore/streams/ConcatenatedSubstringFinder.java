package com.harsh.explore.streams;

import java.util.*;

public class ConcatenatedSubstringFinder {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.isEmpty() || words == null || words.length == 0)
            return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen)
            return result;

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words)
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);

        // We try all possible starting offsets within wordLen
        for (int i = 0; i < wordLen; i++) {
            int left = i, count = 0;
            Map<String, Integer> windowMap = new HashMap<>();

            for (int j = i; j <= s.length() - wordLen; j += wordLen) {
                String word = s.substring(j, j + wordLen);

                if (wordMap.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    count++;

                    while (windowMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    windowMap.clear();
                    count = 0;
                    left = j + wordLen;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String string ="barfoothefoobarman";
        String[] word ={"foo","bar"};
        ConcatenatedSubstringFinder csf = new ConcatenatedSubstringFinder();
        System.out.println(csf.findSubstring(string,word));
    }
}
