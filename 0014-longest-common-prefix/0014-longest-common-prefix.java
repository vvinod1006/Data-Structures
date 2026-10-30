class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        StringBuilder ans =new StringBuilder();
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i=0;i<=first.length()-1 && i<=last.length()-1 ; i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            ans.append(first.charAt(i));

        }
        return ans.toString();






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