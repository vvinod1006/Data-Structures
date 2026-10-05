class Solution {
    public int scoreOfParentheses(String s) {
        LinkedList<Integer> li = new LinkedList<>();
        int count =0;
        char c[] =s.toCharArray();
        for(char x : c){
            if(x == '('){
                li.addLast(count);     
                count = 0;
            }else{
                int previous = li.removeLast();
                if(count == 0){
                    count = previous + 1;
                }else{
                    count = previous + 2 * count;
                }
            }
        }
        
        return count;
        
    }
}