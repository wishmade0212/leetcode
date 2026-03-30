class Solution {
    public int arrangeCoins(int n) {
        long l=0,r=n;
        long count=0;
        while(l<=r){
            long mid=l+(r-l)/2;
            count=mid*(mid+1)/2;
            if(count==n){
                 return (int) mid;
            }
            else if(count<n) l=mid+1;
            else r=mid-1;
        }
        return (int) r;
    }
}