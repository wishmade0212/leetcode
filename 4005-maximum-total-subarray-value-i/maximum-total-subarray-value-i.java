class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int res=0;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
       return (long) k*(max-min); 
    }
}