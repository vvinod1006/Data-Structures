class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = 0;
        int rev2 = 0;
        int save = num;
        while(num!=0){
            int r = num%10;
            num = num/10;
            rev1 = rev1 * 10;
            rev1 = rev1 + r;
        }
        int save2 = rev1;
        while(rev1!=0){
            int r = rev1%10;
            rev1 = rev1/10;
            rev2 = rev2 * 10;
            rev2 = rev2 + r;
        }
        return rev2==save;
    }
}