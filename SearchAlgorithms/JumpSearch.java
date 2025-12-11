public class JumpSearch {

    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;

        // Step size = √n
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        // Find the block where target may exist
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));

            if (prev >= n) {
                return -1; // Target not found
            }
        }

        // Linear search inside the block
        while (arr[prev] < target) {
            prev++;

            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        // Check the element
        if (arr[prev] == target) {
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 12, 15, 18, 21};
        int target = 15;

        int index = jumpSearch(arr, target);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
