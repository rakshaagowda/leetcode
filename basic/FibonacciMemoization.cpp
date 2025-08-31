#include <vector>
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. 


class Solution {
public:
    int fibii(int n,vector<int>&dp) {
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        if(dp[n]!= -1)
            return dp[n];
        dp[n]=fibii(n-1,dp)+fibii(n-2,dp);
        return dp[n];
    }
    int fib(int n){
        vector<int>dp(n+1,-1);
        int ans=fibii(n,dp);
        return ans;
    }
};