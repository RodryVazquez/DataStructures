package BigO;

public class LinearTime {

    public void log(int[] numbers) {
        //O(1 + N + 1)
        //O(2N), runtime complexity is O(N)
        System.out.println(); //O(1)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); //O(N)
        }
        System.out.println();//O(1)
    }

    public void logLoop(int[] numbers) {
        //O(N), runtime complexity O(N)
        for (int number : numbers
        ) {
            System.out.println(number);
        }
        //O(N)
        for (int number : numbers
        ) {
            System.out.println(number);
        }
    }

    public void logLoop(int[] numbers, String[] names) {
        //O(N) , runtime complexity 0 (N + M) or O(N)
        for (int number : numbers
        ) {
            System.out.println(number);
        }
        //O(M)
        for (String name : names
        ) {
            System.out.println(name);
        }
    }
}
