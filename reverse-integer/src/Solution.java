public class Solution {
    public int reverse(int x) {
        int y = 0;
        int prev;
        while (x != 0) {
            prev = y;
            y *= 10;
            int next = x % 10;
            y += next;
            x /= 10;
            if (prev != (y - next) / 10) return 0;
        }
        return y;
    }
}
