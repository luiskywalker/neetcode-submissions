class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int globalMaxProduct = nums[0];

        for(int i=1; i < nums.length ; i++){
            int previousMax = maxEnding;
            int previousMin = minEnding;

            maxEnding = Math.max(nums[i],Math.max(previousMax * nums[i],
                                                    previousMin * nums[i]));
            minEnding = Math.min(nums[i], Math.min(previousMax * nums[i], 
                                                    previousMin * nums[i]));
            globalMaxProduct = Math.max(globalMaxProduct, maxEnding);
        }
        return globalMaxProduct;
    }
}
