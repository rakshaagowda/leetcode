#include <climits>
#include <math.h>
class Solution {
public:
    bool isPowerOfTwo(int n) {
        if (n <= 0) return false;
        
        
        for (int i = 0; i <= 30; i++) {
          int ans = pow(2,i);
            if(n==ans);
            return true;
        }
        return false;
    }
};
