public class Subarray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("All possible subarrays:");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }
}