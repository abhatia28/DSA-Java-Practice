public class Day01 {

    // Method 1: Using Loop - O(n)
    static long sumWithLoop(int n) {
        long total = 0;

        for (int number = 1; number <= n; number++) {
            total += number;
        }

        return total;
    }

    // Method 2: Using Formula - O(1)
    static long sumWithFormula(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        System.out.println("Using Loop: " + sumWithLoop(100));

        System.out.println("Using Formula: " + sumWithFormula(100));
    }
}
