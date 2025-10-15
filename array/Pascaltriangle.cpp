/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly 
*/

#include <vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> triangle;
        for(int rownum=0; rownum<numRows; ++rownum){
            vector<int> row;
            row.push_back(1);
            if(rownum > 0){
                vector<int>& prevrow = triangle.back();
                for(int j=1; j<rownum; ++j){
                    row.push_back(prevrow[j-1] + prevrow[j]);
                }
                row.push_back(1);
            }
            triangle.push_back(row);
        }
        return triangle;
    }
};
