/**
 * EASY
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 */


public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++)
            if(target < nums[i] || target == nums[i]){
                return i;
            }
        return nums.length;
    }
}
