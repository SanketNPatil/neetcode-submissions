class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            arr[i] = value;
            arr[i+nums.length] = value;
        }
        return arr;
    }
}