class Solution {
    public String sortVowels(String str) {
        char[] s = str.toCharArray();
        
        int[] count = new int[128];
        for (int i = 0; i < s.length; i++) {
            if (isvowel(s[i])) {
                count[s[i]]++;
            }
        }
        
        char[] order = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int vowelIdx = 0;

        int left = 0;
        int right = s.length - 1;

        while (left <= right) {
            while (left <= right && !isvowel(s[left])) {
                left++;
            }
            while (right >= left && !isvowel(s[right])) {
                right--;
            }
            
            if (left <= right) {
                while (vowelIdx < order.length && count[order[vowelIdx]] == 0) {
                    vowelIdx++;
                }
                
                s[left] = order[vowelIdx];
                count[order[vowelIdx]]--;
                left++; 
            }
        }

        return new String(s);
    }

    boolean isvowel(char c) {
        c = Character.toLowerCase(c);
        if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
            return true;
        }
        return false;
    }
}
