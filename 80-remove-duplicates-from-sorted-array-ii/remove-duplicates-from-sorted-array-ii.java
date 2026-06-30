class Solution {
    public int removeDuplicates(int[] nums) {
        int w=2;
        for(int r=2;r<nums.length;r++){
            if(nums[r]!=nums[w-2]){
                nums[w++]=nums[r];
            }
        }
        return w;
        
    }
}