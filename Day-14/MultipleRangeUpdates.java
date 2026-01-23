import java.util.*;

class MultipleRangeUpdates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Read number of updates
        System.out.print("Enter number of updates: ");
        int q = sc.nextInt();

        // Difference array (size n+1 for boundary handling)
        int[] diff = new int[n + 1];

        // Read each update
        System.out.println("Enter updates in format: L R value");
        for (int i = 0; i < q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int val = sc.nextInt();

            diff[L] += val;
            if (R + 1 < diff.length)
                diff[R + 1] -= val;
        }

        // Build final array using prefix sum
        int[] arr = new int[n];
        arr[0] = diff[0];

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }

        // Output result
        System.out.println("Final array:");
        System.out.println(Arrays.toString(arr));
    }
}
