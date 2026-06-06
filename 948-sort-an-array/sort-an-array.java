class Solution {
    public int[] sortArray(int[] nums) {
        int s=0;
        int e=nums.length-1;
        quicksort(nums,s,e);
        return nums;
    }
    void quicksort(int[] nums,int low,int high){
        if(low>=high) return;
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];
        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            }
        }
        quicksort(nums,low,end);
        quicksort(nums,start,high);
    }
}