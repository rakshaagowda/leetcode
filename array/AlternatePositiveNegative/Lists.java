package AlternatePositiveNegative;
import java.util.*;
/*
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 */
public class Lists {
  public void alternatePositiveNegative(int[] nums) {
    List<Integer> v1 = new ArrayList<>();
    List<Integer> v2 = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();

    for (int num : nums) {
      if(num>0){
        v1.add(num);

      }
      else{
        v2.add(num);
      }
    } 
    int index1=0,index2=0;
    while(index2<nums.length/2){
      ans.add(v1.get(index1++));
      ans.add(v2.get(index2++));
    }
    System.out.println(ans);
  }
}
