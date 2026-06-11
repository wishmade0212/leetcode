class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,(map.getOrDefault(c,0)+1));
        }
        for(char c:t.toCharArray()){
            int count=map.getOrDefault(c,0)-1;
            if(count<0) return c;
            map.put(c,count);

        }

        return '\0';
        
    }
}