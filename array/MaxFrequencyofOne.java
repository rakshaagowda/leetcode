public class MaxFrequencyofOne {
  public void maxFrequency(int[] nums) {
  int n=nums.length;
  int curr=0,max=0;
  for(int i=0;i<n;i++){
    if(nums[i]==1){
      curr++;
      max=Math.max(curr,max);
    }
    else{
      curr=0;
    }
  }
  
  
  }
}
