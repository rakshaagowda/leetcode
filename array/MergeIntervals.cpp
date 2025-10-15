/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input*/
#include <algorithm>

#include <vector>
using namespace std;
class Solution {
    public:
     vector<vector<int>> merge(vector<vector<int>>& intervals) {
         if(intervals.empty())
            return{};

        sort(intervals.begin(),intervals.end(),[](const vector<int>& a,const vector<int>& b){ return a[0]<b[0];});
        vector<vector<int>> ans;
        vector<int> last=intervals[0];

        for(int i=1;i<intervals.size();i++){
            vector<int> cur = intervals[i];
            if(cur[0]<=last[1]){
                last[1]=max(last[1],cur[1]);

            }
            else{
                ans.push_back(last);
                last=cur;
            }
        }
        ans.push_back(last);
        return ans;

    }
};