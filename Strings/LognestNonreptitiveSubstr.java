package Strings;
//Longest substring without repeating characters

import java.util.HashSet;


public class LognestNonreptitiveSubstr {

    public static void main(String[] args){
        String str = "abcadaad";
        int len = subsetlen(str);
        int index = startIndex(str);
        System.out.println(str.substring(index, index+len) + " "+ len);

    }

    static int subsetlen(String str){
        HashSet<Character> set = new HashSet<>();

        int left=0; 
        int right=0;
        int strLen = 0;

        while(right < str.length()){
            char c = str.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                strLen = Math.max(strLen, right - left + 1);
                right++;
            }else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        return strLen;
    }

    static int startIndex(String str){
        HashSet<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;
        int start = 0;
        int maxLen = 0;

        while (r<str.length()) {
            char  ch = str.charAt(r);
            if(!set.contains(ch)){
                set.add(ch);
                if(r - l + 1 > maxLen){
                    maxLen = r;
                    start = l;
                }
                r++;
            }else{
                set.remove(str.charAt(l));
                l++;
            }
        }
        return start;
    }
}
