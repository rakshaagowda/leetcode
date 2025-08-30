//Given an integer n, return true if it is a power of two. Otherwise, return false.
class Solution {

public:
    bool isPowerOfTwo(int n) {
        
        
        return n>0 && ((n&(n-1))==0);
    }
};