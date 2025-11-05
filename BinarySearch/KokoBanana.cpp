/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.*/

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