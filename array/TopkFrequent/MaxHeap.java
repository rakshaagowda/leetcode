package TopkFrequent;
//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order
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
        /*By default, Java’s PriorityQueue is a min-heap, meaning it returns the smallest element first.

But here, we want to get the most frequent elements first (i.e., the largest frequency), so we need to reverse the order.

Thus, we give it a custom comparator — (a, b) -> b[1] - a[1] — to make it behave like a max-heap based on frequency. */
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

