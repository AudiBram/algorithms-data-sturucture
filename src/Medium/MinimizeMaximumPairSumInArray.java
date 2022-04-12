package Medium;

public class MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int pairSum = nums[i] + nums[nums.length - 1 - i];
            res = Math.max(pairSum, res);
        }
        return res;
    }
}
