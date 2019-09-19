class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int a = 0; a != nums.length - 1; ++a) {
            for (int b = a + 1; b != nums.length; ++b) {
                if (nums[a]+nums[b]==target) {
                    ans[0] = a;
                    ans[1] = b;
                    return ans;
                }
            }
        }
        return ans;
    }
}