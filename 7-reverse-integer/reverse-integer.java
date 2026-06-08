class Solution {
    public int reverse(int x) {
        int max=Integer.MAX_VALUE;
        long reverse =0;
        while(x!=0){
            int a=x%10;
            reverse=reverse*10+a;
            x/=10;
        }
        if(reverse>max || reverse<Integer.MIN_VALUE) return 0;
        return (int) reverse;
        
    }
}