public class SingleElement {
  public void singleElement(int[] nums) {
    int ans = 0;
    for (int num : nums) {
      ans ^= num;
    }
    System.out.println(ans);
  }
}
