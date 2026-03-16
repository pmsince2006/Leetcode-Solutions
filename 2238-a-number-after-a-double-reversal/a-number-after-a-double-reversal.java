class Solution {
    static int rev(int n){
        int last=0;
        int reverse = 0;
        while(n!=0){
            last=n%10;
            n=n/10;
            reverse=reverse*10+last;
        }
        return reverse;
    }
    public boolean isSameAfterReversals(int num) {
        int reversed = rev(num);
        int nrev = rev(reversed);

        return nrev == num;
        

    }
}