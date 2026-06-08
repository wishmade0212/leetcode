class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int s = 0;
        int e = nums.length-1;
        int[] res=new int[e+1];
        int j=0;
        for(int i:nums){
            if(pivot>i) res[j++]=i;
        }
        for(int i:nums){
            if (pivot==i) res[j++]=i;
        }
        for(int i:nums){
            if(pivot<i) res[j++]=i;
        }
        return res;
    }
}