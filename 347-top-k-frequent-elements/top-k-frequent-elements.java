class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n: nums){
                map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int i:map.keySet()){
            queue.offer(i);
            if(queue.size()>k){
                queue.poll();
            }
        }
        int[] res=new int[k];
        int j=0;
        for(int i:queue){
            res[j++]=i;
        }
        return res;
    }
}