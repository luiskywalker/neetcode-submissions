class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> elements = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(elements.contains(nums[i])){
        //         return true;
        //     }else{
        //         elements.add(nums[i]);
        //     }

        // }
        // return false;

        // Sort the array to place duplicate elements adjacent to each other
        Arrays.sort(nums);
      
        // Iterate through the sorted array and check adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            // If two adjacent elements are equal, we found a duplicate
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
      
        // No duplicates found after checking all adjacent pairs
        return false;
    }
}