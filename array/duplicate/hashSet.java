package leetcode.array.duplicate;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}
public class hashSet {
  public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        boolean result = solution.containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);

        int[] nums2 = {1, 2, 3, 4, 4};
        result = solution.containsDuplicate(nums2);
        System.out.println("Contains duplicate: " + result);
  }   
}
