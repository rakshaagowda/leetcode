//Given an integer array nums, find the subarray with the largest sum, and return its sum.
public class KadaneAlgorithm {
  
  public int maxSubArray(int[] nums) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for (int num : nums) {
      currentSum = Math.max(currentSum + num, num);
      maxSum = Math.max(maxSum, currentSum);
      
    }
    return maxSum;
  }
  
}
