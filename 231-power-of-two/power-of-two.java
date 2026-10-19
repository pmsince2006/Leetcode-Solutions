class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n > 0 && (n&(n-1))==0){
        //     return true;
        // }
        // else return false;

        if( n <= 0){
            return false;
        }

        while(n % 2 == 0){
            n = n / 2;
        }

        return n == 1;
        
    }
}