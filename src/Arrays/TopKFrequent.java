package Arrays;

import java.util.*;

public class TopKFrequent {
//        RETURN THE K MOST FREQUENT ELEMENTS
    public static List<Integer> solution(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.putIfAbsent(i, 0);
            map.computeIfPresent(i, (x, y) -> y + 1);
        }
//      MAKING A PRIORITY QUEUE
//      ORDER IN DESCENDING ORDER
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        System.out.println(heap);
        for (int key : map.keySet()) {
            heap.add(key);
        }
        System.out.println(heap);

        for (int i = 0; i < k; i++) {
//           .poll() Retrieves and removes the head of this queue/heap
            res.add(heap.poll());
        }
        return res;
    }
}
