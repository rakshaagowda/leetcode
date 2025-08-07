package duplicate;

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer,Integer> seen = new HashMap<>();
      for(int num : nums){
        if(seen.containsKey(num))
          return true;
        seen.put(num, 1);
      }
      return false;
    }
}

public class hashMap {
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
