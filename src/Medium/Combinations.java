package Medium;

/**
 * Diberikan dua bilangan bulat n dan k,
 * kembalikan semua kemungkinan kombinasi k angka di luar rentang [1, n].
 * <p>
 * Example 1:
 * Input: n = 4, k = 2
 * Output:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList();
        backtrack(list, n, k, new ArrayList(), 1);
        return list;

    }
    public void backtrack(List<List<Integer>> list, int n, int k, List<Integer> temp, int start) {
        if (k == 0) {
            list.add(new ArrayList(temp));
            return;
        }

        for (int i = start; i <= n - k + 1; i++) {
            temp.add(i);
            backtrack(list, n, k - 1, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
