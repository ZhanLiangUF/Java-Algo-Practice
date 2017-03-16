// use priority queue and change ordering - MAX HEAP
public class ThirdMax {
    public int thirdMax(int[] nums) {
        int length = nums.length;
        int counter = 1;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(length, Collections.reverseOrder());
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < length; i++) {
            if (!set.contains(nums[i])) {
            pq.offer(nums[i]);
            set.add(nums[i]);
            }
        }
        if (pq.size() < 3) {
            return pq.peek();
        } else if (pq.size() >3) {
            for(int i =0;i<2;i++) {
            pq.poll();
           }
        return pq.peek();
        }
    pq.poll();
    pq.poll();
    return pq.peek();
    }
}
