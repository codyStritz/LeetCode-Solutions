import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        char[] s = {'a','b','c','d'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int len = s.length;
        int maxIndex = s.length - 1;
        char temp;
        for (int i = 0; i < len/2; i++) {
            temp = s[i];
            s[i] = s[maxIndex - i];
            s[maxIndex - i] = temp;
        }
    }
}
