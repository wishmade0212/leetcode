class Solution {
    public String reverseVowels(String str) {
        char[] s = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while (left <right) {
            while (!isvowel(s[left]) && left < right) {
                left++;
            }
            while (!isvowel(s[right]) && right > left) {
                right--;
            }
            if (left <= right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }
        return new String(s);
    }
    boolean isvowel(char c){
        c=Character.toLowerCase(c);
        if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')){
            return true;
        }
        return false;

    }
}