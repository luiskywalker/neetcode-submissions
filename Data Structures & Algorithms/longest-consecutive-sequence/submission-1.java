class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num:nums){//we populate a Set with all numbers in num
            numSet.add(num);
        }
        int longest =0;
        for(int num: numSet){//Iterate over the Set
            if(!numSet.contains(num-1)){//Check if the actual element is the start of a sequence
                int length = 1 ;
                while(numSet.contains(num+length)){//count how long is the sequence
                    length++;
                }
                longest = Math.max(longest, length);//update the longest sequence value if its the maximum
            }
        }

        return longest;

    }
}
