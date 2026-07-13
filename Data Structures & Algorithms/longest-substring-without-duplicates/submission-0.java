class Solution {
    public int lengthOfLongestSubstring(String s) {
                int longest = 0;
        int left = 0;
        HashSet<Character> window = new HashSet<>();
        for (int right = 0; right < s.length(); ++right) {
            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
