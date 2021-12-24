package Easy;

import java.util.Arrays;

/**
 * Easy
 *
 * Diberikan array bilangan bulat yang diurutkan dalam urutan yang tidak menurun,
 * kembalikan array kuadrat dari setiap angka yang diurutkan dalam urutan yang tidak menurun.
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 */

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
