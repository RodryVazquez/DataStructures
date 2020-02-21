package BigO;

public class QuadraticTime {

    public void logQuadratic(int[] numbers) {
        // O(n + n  2)
        // O(n  2)
        for (int number : numbers //O(n)
        ) {
            System.out.println(number);
        }

        for (int first : numbers //O(n)
        ) {
            for (int second : numbers //O(n)
            ) {
                System.out.println(first + ", " + second);
            }
        }
    }

    public void logSlowQuadratic(int[] numbers) {
        // O(n + n  3)
        // O(n  3)
        for (int number : numbers //O(n)
        ) {
            System.out.println(number);
        }

        for (int first : numbers //O(n)
        ) {
            for (int second : numbers //O(n)
            ) {
                for (int third : numbers
                ) {
                    System.out.println(first + ", " + second + ", " + third);
                }
            }
        }
    }
}
