class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();
        List<Integer> cur=new ArrayList<>();
        backtrack(nums,0,cur,res);
        List<List<Integer>> res1=new ArrayList<>(res);
        return res1;
    }
    public void backtrack(int[] nums,int start,List<Integer> cur,Set<List<Integer>> res){
        res.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            backtrack(nums,i+1,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}