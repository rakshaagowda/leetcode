package TopkFrequent;
//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinHeap {
  

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums)
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(

            (a, b) -> a.getValue() - b.getValue()

        );

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet())
        {
            minHeap.add(entry);

            if(minHeap.size() > k)
            {
                minHeap.poll();
            }
        }

        int i = 0;

        int[] res = new int[k];

        for(Map.Entry<Integer, Integer> entry : minHeap)
        {
            res[i ++] = entry.getKey();
        }

        return res;
        
    }
}

