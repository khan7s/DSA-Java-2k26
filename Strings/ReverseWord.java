package Strings;
// Reverse words in a sentence (Reverse the order of words, not characters)
public class ReverseWord {
    public static void main(String[] args) {
        String s = "HeLLo world java coding";
        char[] arr = s.toCharArray();
        reverseWord(arr);
        System.out.println(new String(arr));
    }

    static void reverseWord(char[] str){
        reverse(str, 0, str.length - 1);

        // Reverse each word
        int start = 0;
        for (int end = 0; end <= str.length; end++) {
            if (end == str.length || str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
    }
    static void reverse(char[] s, int start, int last){
        while(start<last){
            char temp = s[start];
            s[start] = s[last];
            s[last] = temp;
            start++;
            last--;
        }
    }
}
