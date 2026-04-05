import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    static void subsets(int[] num, int i, ArrayList<Integer> arr, List<List<Integer>> ans){
        if(i == num.length){
            ans.add(new ArrayList<>(arr));
            return;
        }

        arr.add(num[i]);
        subsets(num, i + 1, arr, ans);

        arr.remove(arr.size() - 1);
        subsets(num, i + 1, arr, ans);
    }
}