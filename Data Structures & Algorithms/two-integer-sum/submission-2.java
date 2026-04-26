class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int value = nums[index];
            int findPair = target - value;

            if (map.containsKey(findPair)) {
                return new int[] {map.get(findPair), index};
            } else {
            map.put(value, index);
            }
        }
        return new int[] {};
    }
}
