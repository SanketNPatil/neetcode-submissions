class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) { // is it a sequence start?

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) { // extend sequence
                    current++;
                    count++;
                }

                longest = Math.max(count, longest); // track global max
            }
        }

        return longest;
    }
}
