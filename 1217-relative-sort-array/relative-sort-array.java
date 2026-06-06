class Solution {
    HashMap<Integer,Integer>map=new HashMap<>();
    public int[] relativeSortArray(int[] nums, int[] nums2) {
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
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
            while(compare(nums[start],pivot)<0){
                start++;
            }
            while(compare(nums[end],pivot)>0){
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
    int compare(int a,int b){
        boolean a1=map.containsKey(a);
        boolean b1=map.containsKey(b);
        if(a1 && b1){
            return map.get(a)-map.get(b);
        }
        else if(a1) return -1;
        else if(b1) return 1;
        else  return a-b;
    }
}