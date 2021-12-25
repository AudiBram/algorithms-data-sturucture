package Easy;

/**
 * Diberikan array integer nums dan dua integer target dan start,
 * temukan indeks i sedemikian rupa sehingga nums[i] == target dan abs(i - start) diminimalkan.
 * Perhatikan bahwa abs(x) adalah nilai absolut dari x.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5], target = 5, start = 3
 * Output: 1
 * Explanation: nums[4] = 5 is the only value equal to target, so the answer is abs(4 - 3) = 1.
 */

public class MinimumDistanceToTheTargetElement {
    public int getMinDistance(int[] nums, int target, int start) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res = Math.min(res, Math.abs(i - start));
            }
        }
        return res;
    }
}
