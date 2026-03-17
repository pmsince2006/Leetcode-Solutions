class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> st;

        for(auto it : nums1){
            st.insert(it);
        }

        vector<int> ans;
        unordered_set<int> check;
        for(auto it : nums2){
            if(st.find(it) != st.end() && !check.contains(it)){
                ans.push_back(it);
                check.insert(it);
            }
        }

        return ans;
    }
};