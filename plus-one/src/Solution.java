import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] num = {9,9,9};
        System.out.println(Arrays.toString(plusOne(num)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i > -1; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
