class Solution {
    public long beautifulSubarrays(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        int prefixXor = 0;
        long count = 0;

        for (int num : nums) {
            prefixXor ^= num;

            int target = prefixXor ^ 0;

            if (freq.containsKey(target)) {
                count += freq.get(target);
            }

            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
        }
        return count;
    }
}