class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n/3) {
               list.add(entry.getKey());
            }
        }
        return list;
    }
}