package Medium;

/**
 * Diberikan string s, kita dapat mengubah setiap huruf secara individual menjadi huruf kecil atau huruf besar untuk membuat string lain.
 * Kembalikan daftar semua kemungkinan string yang bisa kita buat. Kembalikan output dalam urutan apa pun.
 * <p>
 * Example 1:
 * Input: s = "a1b2"
 * Output: ["a1b2","a1B2","A1b2","A1B2"]
 * <p>
 * Example 2:
 * Input: s = "3z4"
 * Output: ["3z4","3Z4"]
 */

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        LinkedList<String> result = new LinkedList();
        result.add(s);
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int size = result.size();
                while (size-- > 0) {
                    String o = result.poll();
                    String left = o.substring(0, i);
                    String right = o.substring(i + 1, n);
                    result.add(left + Character.toLowerCase(c) + right);
                    result.add(left + Character.toUpperCase(c) + right);
                }
            }
        }
        return result;
    }
}
