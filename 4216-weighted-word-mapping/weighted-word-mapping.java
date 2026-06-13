class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int i,pointer=0;
        char[] res=new char[words.length];
        int k=0;
        for(String text:words){
            int gsum=0;
            for(i=0;i<text.length();i++){
                int ind=text.charAt(i)-'a';
                gsum+=weights[ind];
            }
            int target=25-(gsum%26);
            res[k++]=(char) ('a'+target);
        }
        return new String(res);

    }
}