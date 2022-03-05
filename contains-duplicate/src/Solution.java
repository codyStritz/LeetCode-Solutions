import java.util.HashSet;
import java.util.Set;


public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int n : nums) {
            if (numSet.contains(n)) return true;
            numSet.add(n);
        }
        return false;
    }
}
