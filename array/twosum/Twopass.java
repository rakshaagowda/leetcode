package twosum;
import java.util.HashMap;
public class Twopass {
  public int[] twoSumHashMap(int arr[],int target){
    int n=arr.length;
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0;i<n;i++){
      map.put(arr[i],i);
    }
    for(int i=0;i<n;i++){
      int complement=target-arr[i];
      if(map.containsKey(complement) && map.get(complement)!=i){
        return new int[]{i,map.get(complement)};
      }
    }
    return new int[]{-1, -1}; // Return empty array if no solution found
  }
}
