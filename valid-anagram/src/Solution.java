public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (char c : s.toCharArray()) {
            sCount[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            tCount[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) return false;
        }
        return true;
    }
}
