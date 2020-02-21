package Arrays;

import java.util.Arrays;

public class ArrayUtils {

    private int[] numbers;
    private int size;
    private int count;

    public ArrayUtils(int size) {
        numbers = new int[size];
        this.size = size;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void insert(int number) {
        int length = numbers.length;
        if (count == length) {
            int[] newNumbers = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
        numbers[count++] = number;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        // 1 2 3
        // 0 1 2
        //count = 3
        //index = 1
        for (int i = index; i < count; i++) {
              numbers[i] = numbers[i + 1];
        }
        count--;
    }

    public int indexOf(int index) {
        for (int i = 0; i < count; i++) {
            if(numbers[i] == index){
                return numbers[i];
            }
        }
        return -1;
    }
}
