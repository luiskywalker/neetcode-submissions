class Solution {
    public String minWindow(String original, String check) {
        HashMap<Character, Integer> checkCount = new HashMap<>();
        HashMap<Character, Integer> windowCount = new HashMap<>();
        for (char ch : check.toCharArray()) {
            checkCount.merge(ch, 1, Integer::sum);
        }
        int satisfied = 0;
        int required = checkCount.size();
        int m = original.length();
        int window = -1;
        int length = m + 1;
        int l = 0;
        for (int r = 0; r < m; ++r) {
            if (checkCount.containsKey(original.charAt(r))) {
                windowCount.put(original.charAt(r), windowCount.getOrDefault(original.charAt(r), 0) + 1);
                if (windowCount.get(original.charAt(r)) == checkCount.get(original.charAt(r))) {
                    satisfied++;
                }
            }
            while (satisfied == required) {
                int currentLength = r - l + 1;
                if (currentLength < length ||
                    (currentLength == length && original.substring(l, r + 1).compareTo(original.substring(window, window + length)) < 0)) {
                    window = l;
                    length = currentLength;
                }
                if (checkCount.containsKey(original.charAt(l))) {
                    windowCount.put(original.charAt(l), windowCount.get(original.charAt(l)) - 1);
                    if (windowCount.get(original.charAt(l)) < checkCount.get(original.charAt(l))) {
                        satisfied--;
                    }
                }
                l++;
            }
        }
        return window >= 0 ? original.substring(window, window + length) : "";
    }
}
