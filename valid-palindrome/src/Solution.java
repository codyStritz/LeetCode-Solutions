public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (c[i] != c[j]) {
                if (!Character.isLetterOrDigit(c[i])) {
                    i++;
                    continue;
                }
                if (!Character.isLetterOrDigit(c[j])) {
                    j--;
                    continue;
                }
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
