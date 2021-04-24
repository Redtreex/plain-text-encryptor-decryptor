import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class RandomGenerator {
    /*
       adding nonZero with the generated nextInt() to eliminate the possibility of
       generating a seed value of zero which causes to generate same sequence of random number by resetting
    */
    Random r = new Random();
    int nonZero = 1;
    int bound = 10;
    int seed = r.nextInt(bound - 1) + nonZero;

    /*
     * this method returns an array of random numbers generated with a non zero random seed with a bound
     * */
    public int[] RandomNumArray() {
        Random rand = new Random(seed);
        int arr[] = new int[95];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(95);
        }
        return arr;
    }
}
