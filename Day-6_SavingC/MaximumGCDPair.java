import java.util.*;

class MaximumGCDPair {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        int max = 0;
        for (int x : arr) max = Math.max(max, x);

        int[] freq = new int[max + 1];

        // Count frequency
        for (int x : arr) {
			freq[x]++;
		}

        // Check divisors from largest to smallest
        for (int d = max; d >= 1; d--) {
            int count = 0;
            for (int multiple = d; multiple <= max; multiple += d) {
                count += freq[multiple];
                if (count >= 2) {
                    System.out.println(d);
                    return;
                }
            }
        }
    }
}
