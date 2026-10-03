class Solution {
    public boolean areOccurrencesEqual(String s) {
        char a[] = s.toCharArray();
        HashMap<Character,Integer> h = new HashMap<>();
        for(char x:a){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int cout=-1;
        boolean b=true;
        for( int c:h.values()){
            if(cout==-1){
                cout=c;
            }
            if(c!=cout){
                b=false;
                break;
            }
        }
        return b;
        
    }
}