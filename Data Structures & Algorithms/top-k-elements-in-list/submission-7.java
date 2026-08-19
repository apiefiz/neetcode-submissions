class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length;i++)
        {
            hm.putIfAbsent(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> hm.get(a)-hm.get(b));

        for(int num: hm.keySet()){
            heap.offer(num);
            if(heap.size()>k)
             heap.poll();
        }
        int i=0;
        int[] arr=new int[k];
        while(!heap.isEmpty()){
            arr[i]= heap.poll();
            i++;
        }

        return arr;
    }
}
