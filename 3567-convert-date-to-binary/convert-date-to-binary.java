class Solution {
    public String convertDateToBinary(String str) {
        String[] arr = str.split("-"); 
        String[] narr = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String binary=dec(arr[i]);
            narr[i]=binary;   
        }
        String result = String.join("-", narr);
        return result;
    }

    static String dec(String x){
        int n = Integer.parseInt(x);
        String binary = "";

        while(n > 0){
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        return binary;
        
    }
}