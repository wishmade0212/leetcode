class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordset=new HashSet<>(wordList);
        if(!wordset.contains(endWord)) return 0;
        Set<String> visited=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        int length=0;
        while(!q.isEmpty()){
            int size=q.size();
            length++;
            for(int i=0;i<size;i++){
                String text=q.poll();
                for(int j=0;j<text.length();j++){
                    char[] temp=text.toCharArray();
                    for(char c='a';c<='z';c++){
                        temp[j]=c;
                        String newword=new String(temp);
                        if(newword.equals(endWord)) return length+1;
                        if(wordset.contains(newword) && (!visited.contains(newword))){
                            q.offer(newword);
                            visited.add(newword);
                        }
                    }
                }
            }

        }

      return 0;  
    }
}