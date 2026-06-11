class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] text=s.split(" ");
        if(text.length!=pattern.length()) return false;
        char[] pat=pattern.toCharArray();
        for(int i=0;i<text.length;i++){
            if(!(map.containsKey(pat[i]))){
                if((map.containsValue(text[i])))return false;
                map.put(pat[i],text[i]);
            }
            else {
                String nt=map.get(pat[i]);
                if(!(nt.equals(text[i]))) return false; 
            }
        }
        return true;
        
    }
}