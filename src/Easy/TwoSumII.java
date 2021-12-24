package Easy;

/**
 * Two Sum II - Input Array Is Sorted
 *
 *Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * Example :
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target){

        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            if(numbers[start] + numbers[end] == target){
                return new int[]{start + 1, end + 1};
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{start - 1, end - 1};
    }
}
