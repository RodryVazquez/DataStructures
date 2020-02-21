package BigO;

public class ConstantTime {

    public void constantTime(int[] dataset) {
        //Constant time, runtime complexity O(1)
        System.out.println(dataset[0]);
    }

    public void repeatConstantTime(int[] dataset) {
        //O(2), runtime complexity 0(1)
        System.out.println(dataset[0]);
        System.out.println(dataset[1]);
    }
}
