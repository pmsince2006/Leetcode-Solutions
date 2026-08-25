class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int[] multiple = new int[n];

        for(int i = 0; i < n; i++){
            multiple[i] = k * (i + 1);
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            boolean found = false;

            for(int j = 0; j < n; j++){
                if(nums[j] == multiple[i]){
                    found = true;
                    break;
                }
            }

            if(!found){
                return multiple[i];
            }
        }

        return k * (n + 1);
    }
}