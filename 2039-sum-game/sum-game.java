class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int lefts = 0;
        int rights = 0;

        int leftq = 0;
        int rightq = 0;

        for(int i = 0; i < n / 2; i++){
            if(num.charAt(i) == '?'){
                leftq++;
            }
            else{
                lefts += num.charAt(i) - '0';
            }
        }
        for(int i = n / 2; i < n; i++){
            if(num.charAt(i) == '?'){
                rightq++;
            }
            else{
                rights += num.charAt(i) - '0';
            }
        }

        if((leftq + rightq) % 2 == 1){
            return true;
        } 

        return lefts - rights != 9 * (rightq - leftq) / 2;
    }
}