class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int i,min=999999;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target) min=Math.min(min,Math.abs(i-start));
        }
        return  min;
        
    }
}