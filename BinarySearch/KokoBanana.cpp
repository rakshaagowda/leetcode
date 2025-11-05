#include<vector>
#include<climits>

#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        //int low=1,high=findMax(piles);
        long long low = 1, high = *max_element(piles.begin(), piles.end());
        long long totalHours;
        int ans=-1;
        while(low<=high){
            long long mid=(low+high)/2;
            if(countTotal(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return (int)ans;
    }
private:
    long long countTotal(vector<int>& piles,int speed){
        long long count=0;
        for(int i=0;i<piles.size();i++){
            count+=(piles[i]+speed-1)/speed;
        }
        return count;
    }
};