class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans ="";
        Arrays.sort(strs);

        char [] first = strs[0].toCharArray();
        char [] last = strs[strs.length-1].toCharArray();

        for(int i=0;i<=first.length-1 && i<=last.length-1 ; i++){
            if(first[i] != last[i]){
                break;
            }
            ans = ans + first[i];

        }
        return ans;






        // // sort the array of string
        // Arrays.sort(strs);
        // if (strs.length == 0) {
        //     return "";
        // }

        // String str1 = strs[0];
        // String str2 = strs[strs.length - 1];
        // int Minlength = Math.min(str1.length(), str2.length());

        // int p1 = 0;
        // int p2 = 0;
        // String result = "";

        // while (p1 < Minlength && p2 < Minlength) {
        //     if (str1.charAt(p1) == str2.charAt(p2)) {
        //         result += str1.charAt(p1);
        //     } else {
        //         break;
        //     }
        //     p1++;
        //     p2++;
        // }

        // return result;


    }
}