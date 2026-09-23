class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();

        for(int num : nums1){
            st1.add(num);
        }

        for(int num : nums2){
            if(st1.contains(num)){
                st2.add(num);
            }
        }

        int[] ans = new int[st2.size()];

        int i = 0;
        for(int it : st2){
            ans[i] = it;
            i++;
        }

        return ans;
    }
}