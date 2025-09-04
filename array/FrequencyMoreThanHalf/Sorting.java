package FrequencyMoreThanHalf;
import java.util.*;
public class Sorting {
  public int frequency(int[] nums) {
    int n=nums.length;
    Arrays.sort(nums);
    return nums[n/2];
  }
  
}
