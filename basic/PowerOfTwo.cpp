#include <climits>
//Given an integer n, return true if it is a power of two. Otherwise, return false.
class Solution {
public:
    bool isPowerOfTwo(int n) {
        if (n <= 0) return false;
        
        int ans = 1;
        for (int i = 0; i <= 30; i++) {
            if (ans == n) {
                return true;
            }
            // Check for potential overflow before multiplying
            if (ans > INT_MAX / 2) {
                break;
            }
            ans = ans * 2;
        }
        return false;
    }
};
