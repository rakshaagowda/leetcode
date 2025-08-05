//package leetcode.array.anagram;

import java.util.HashMap;
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> counter = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            counter.put(ch,counter.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!counter.containsKey(ch) || counter.get(ch)==0){
                return false;
            }
            counter.put(ch,counter.get(ch)-1);
        }

        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] testCases = {
            {"listen", "silent"},
            {"hello", "world"},
            {"abc", "bca"},
            {"", ""}
        };
        for (String[] testCase : testCases) {
            boolean result = solution.isAnagram(testCase[0], testCase[1]);
            System.out.println("Is '" + testCase[1] + "' an anagram of '" + testCase[0] + "': " + result);
        }
    }
}