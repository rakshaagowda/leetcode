package ProductArray;
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
public class OptimizedDP {
  
    public int[] productExceptSelf(int[] nums) {
      int n=nums.length;
      int[] ans=new int[n];  
      
       ans[0]=1;
      for(int i=1;i<n;i++){
        ans[i]=ans[i-1]*nums[i-1];
      }

      int right=1;
      for(int i=n-1;i>=0;i--){
        ans[i]*=right;
        right*=nums[i];
      }
      
      return ans;
    }
}
/*

    Time Complexity : O(N), As we iterate the Array(nums) twice. Where N = size of the array.

    Space complexity : O(1), Constant space. Extra space is only allocated for the Array(output), however the
    output does not count towards the space complexity.

    Solved using Dynamic Programming Approach(Space Optimization). Optimized Approach.

*/
