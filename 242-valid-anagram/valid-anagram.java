class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!(map.containsKey(c))) return false;
            int count=map.get(c);
            if (count ==0) return false;
            map.put(c,(count-1));
        }
        return true;
    }
}