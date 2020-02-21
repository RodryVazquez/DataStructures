package BigO;

public class Logarithmic {

    /*
     * BigO.Logarithmic time is more scalable than linear or quadratic time
     * One example is binary search
     *
     *
     * Exponential growth is the opposite of logarithmic growth
     *
     * Constant O(1)
     * BigO.Logarithmic O(log n)
     * Linear O(n)
     * Quadratic O(n 2)
     * Exponential O(2n)
     *
     * */


    public void logSpaceComplexity(String[] names) {

        //Space complexity is O(1)
        for (int i = 0; i < names.length; i++) {
            System.out.println("HI " + names[i]);
        }

        //Space complexity is O(N)
        String[] lastNames = new String[names.length];
    }
}
