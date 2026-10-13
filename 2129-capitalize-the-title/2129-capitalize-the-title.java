class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        String result = "";
        for(int i = 0; i <= words.length-1; i++){
            if(words[i].length()>2){
                result += Character.toUpperCase(words[i].charAt(0))+words[i].substring(1);
            }else{
                result = result + words[i];
            }
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }
}