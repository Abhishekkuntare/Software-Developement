import java.util.Map;
import java.util.HashMap;

public class java_23_longest_sum_with_given_value_divisible {
    public static int maxdivisible(int[] arr, int n, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int max_len = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int mod = (((sum % k) + k) % k);

            if (mod == 0) {
                max_len = i + 1;
            }
            if (!map.containsKey(mod)) {
                map.put(mod, i);
            } else {
                int size = i - map.get(mod);
                max_len = Math.max(max_len, size);
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 6, 1, 4, 5 };
        int n = arr.length;
        int k = 3;
        System.out.println("Max length:" + maxdivisible(arr, n, k));
    }
}
