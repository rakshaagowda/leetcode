package AlternatePositiveNegative;
/*
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 */
public class TwoPointerApproach {
  public int[] rearrange(int[] nums){
    int n=nums.length;
    int[] ans=new int[n];
    int posindex=0,negindex=1;
    for(int i=0;i<n;i++){
      if(nums[i]>0){
        ans[posindex]=nums[i];
        posindex+=2;
      }
      else{
        ans[negindex]=nums[i];
        negindex-=2;
      }
    }
    return ans;
  }
  
}
