/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 */
#include <vector>
#include <algorithm>
#include <unordered_map>
#include <set>  
using namespace std;
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>> st;
        for(int i=0;i<nums.size();i++){
            set<int> hashset;
            for(int j=i+1;j<nums.size();j++){
                int third=-(nums[i]+nums[j]);
                if(hashset.find(third)!=hashset.end()){
                    vector<int> temp={nums[i],nums[j],third};
                    sort(temp.begin(),temp.end());
                    st.insert(temp);
                }
                hashset.insert(nums[j]);
            }
        }
        vector<vector<int>> ans(st.begin(),st.end());
        return ans;
    }
};