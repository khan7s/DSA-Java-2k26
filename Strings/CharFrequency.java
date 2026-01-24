package Strings;

import java.util.*;

// you are given a string, e.g., "aabbc"

// Task: count how many times each character appears

/*
1. Most frequent character --> Find the character with the maximum count

2. First non-repeating character --> Find first character with frequency 1

3. Check if two strings are anagrams --> Compare frequency counts of both strings

4. Remove duplicates --> Use frequency map to keep only first occurrence 
*/ 

public class CharFrequency {
    public static void main(String[] args){
        // String s = "aaaannnntddssg";
        // String s = "aabbc123!";
        // getFrequencyBasic(s);
        // getFrequency(s);
        // System.out.println(getMaxFreq(s));
        // System.out.println(getFirstUniqueChar(s));
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(checkAnagrams(str1, str2));
        
    }
    static void getFrequency(String str){
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch:str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry:freq.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

    }

    static void getFrequencyBasic(String str){
        int[] freq = new int[26];
        str = str.toLowerCase();
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for(int j = 0;j<26;j++){
            if(freq[j]>0){
                System.out.println((char)(j+'a') + " --> " + freq[j]);
            }
        }
        char maxChar = 'a';
        int maxCount = 0;
        for(int i = 0; i<26;i++){
            if(freq[i]>0 && freq[i] > maxCount){
                maxChar = (char) (i + 'a');
                maxCount = freq[i];
            }
        }
        System.out.println("Most frequent character is: " + maxChar);
    }

// 1. Most frequent character --> Find the character with the maximum count
    static char getMaxFreq(String str){
        Map<Character, Integer> freq = new HashMap<>();
        
        for(char ch:str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
        }
        char maxChar = '\0';
        int maxCount = 0;

        for(Map.Entry<Character, Integer> entry:freq.entrySet()){
            if(entry.getValue()>maxCount){
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxChar;
    }

    // 2. First non-repeating character --> Find first character with frequency 1
    static char getFirstUniqueChar(String str){
        Map<Character, Integer> freq = new HashMap<>();
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(freq.get(ch) == 1){
                return ch;
            }
        }
        return '\0';
    }

    // 3. Check if two strings are anagrams --> Compare frequency counts of both strings
    static boolean checkAnagrams(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character, Integer> freq = new HashMap<>();
        
        for(int i =0;i<s1.length();i++){
            char ch = s1.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        
        for(int i = 0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(!freq.containsKey(ch)) return false;
            freq.put(ch, freq.get(ch)-1);
            if(freq.get(ch)<0) return false;
        }
        return true;
    }
}
