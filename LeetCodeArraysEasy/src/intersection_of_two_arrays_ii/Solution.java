package intersection_of_two_arrays_ii;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};
        int[] answer = intersect(nums1, nums2);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);
        }
        for (int num : nums2) {
            if (map.get(num) != null && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
