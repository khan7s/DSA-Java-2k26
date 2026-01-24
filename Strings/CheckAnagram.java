package Strings;
// Basic array method,
// Limitation - only work for lower Case;

public class CheckAnagram {
    public static void main(String[] args){
        String s1 = "triangle";
        String s2 = "integral";

        System.out.println(checkAnagram(s1, s2));
    }
    static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
            // System.out.println("Strings are not Anagram");
        }
        int[] freq = new int[26];

        for(int i = 0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for(int c: freq){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
