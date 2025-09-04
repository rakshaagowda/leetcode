package FrequencyMoreThanHalf;
/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
public class MoreVoteAlgorithm {
  public int majorityElement(int[] nums) {
    int count=0;
    int candidate=0;
    for(int num : nums){
      if(count==0){
        candidate=num;
      }
      if(num==candidate){
        count++;

      }
      else{
        count--;
      }
    }
    return candidate;
  }
}
/*INTUITION
 * The intuition behind the Moore's Voting Algorithm is based on the fact that if there is a majority element in an array, it will always remain in the lead, even after encountering other elements.

Explanation:
Algorithm:

Initialize two variables: count and candidate. Set count to 0 and candidate to an arbitrary value.
Iterate through the array nums:
a. If count is 0, assign the current element as the new candidate and increment count by 1.
b. If the current element is the same as the candidate, increment count by 1.
c. If the current element is different from the candidate, decrement count by 1.
After the iteration, the candidate variable will hold the majority element.
 */