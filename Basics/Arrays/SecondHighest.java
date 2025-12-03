public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        Integer highest = null;
        Integer secondHighest = null;

        for (int num : arr) {
            if (highest == null || num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num != highest && (secondHighest == null || num > secondHighest)) {
                secondHighest = num;
            }
        }

        if (secondHighest == null) {
            System.out.println("No second highest element.");
        } else {
            System.out.println("Second highest: " + secondHighest);
        }
    }
}
