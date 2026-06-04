class Solution {
    public String convertDateToBinary(String date) {
        String[] parts=date.split("-");
        for (int i=0;i<parts.length;i++){
            int num=Integer.parseInt(parts[i]);
            parts[i]=Integer.toBinaryString(num);
        }
        return String.join("-",parts);


        
    }
}