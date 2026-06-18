class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(elements.contains(nums[i])){
                return true;
            }else{
                elements.add(nums[i]);
            }

        }
        return false;
    }
}