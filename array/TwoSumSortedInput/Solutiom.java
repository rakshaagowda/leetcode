package TwoSumSortedInput;

/*
 * 1.Initialize two pointers:

--->left ➡️ at index 0

--->right ⬅️ at index numbers.length - 1

2.While left < right:

 Calculate the sum of numbers[left] + numbers[right]

 If the sum equals the target, return their 1-based indices

 If the sum is less than the target, increment left

 If the sum is greater than the target, decrement right

3.If no pair is found (though the problem guarantees one), return [-1, -1] 🚫

This works efficiently by leveraging the sorted order of the array, allowing us to eliminate incorrect pairs in linear time.

Complexity
Time complexity:O(n) 
Space complexity:O(1) 
 */
public class Solutiom {
  
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length -1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}

