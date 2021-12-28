package Medium;

import java.util.Arrays;

/**
 * Diberikan dua string s1 dan s2, kembalikan true jika s2 berisi permutasi s1, atau false sebaliknya.
 * Dengan kata lain, kembalikan true jika salah satu permutasi s1 adalah substring dari s2.
 * <p>
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * <p>
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length() || s2.length() == 0) {
            return false;
        }

        if (s1.length() == 0) {
            return true;
        }

        int x = s1.length(), y = s2.length();
        int[] array1 = new int[26];
        int[] array2 = new int[26];


        for (int i = 0; i < x; i++) {
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;
        }

        for (int i = x; i < y; i++) {
            if (Arrays.equals(array1, array2)) {
                return true;
            }
            array2[s2.charAt(i - x) - 'a']--;
            array2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(array1, array2)) {
            return true;
        } else {
            return false;
        }
    }
}
