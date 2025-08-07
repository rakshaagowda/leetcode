package TopkFrequent;

import java.util.HashMap;
import java.util.PriorityQueue;

public class MaxHeap {
  
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq =  new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int key: hm.keySet()){
            pq.add(new int[]{key,hm.get(key)});
        }

        for(int i=0;i<k;i++){
            int[] temp = pq.remove();
            ans[i]=temp[0];
        }
        return ans;
    }
}

