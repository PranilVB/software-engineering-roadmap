class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] max = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFrequency = Integer.MIN_VALUE;
            int maxElement = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFrequency) {
                    maxFrequency = entry.getValue();
                    maxElement = entry.getKey();
                }
            }
            max[i] = maxElement;
            map.remove(maxElement);
        }

        return max;
    }
}