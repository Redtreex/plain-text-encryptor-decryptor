import java.util.*;

public class RandomGenerator {

    char charArray[];
    static Random r = new Random();
    /**
     * added +1 in the seed to eliminate the chance of getting a 0 as seed
     * */
    static int seed = r.nextInt(94 - 1) + 1;
    static List<char[]> primitiveCharList;
    static List<Character> list = new ArrayList<Character>();

    /**
     * constructor for the class
     * it takes the array of all characters in any order sorted
     * and converts it into a character list data structure
     */
    public RandomGenerator(char a[]) {
        charArray = a;
        primitiveCharList = Arrays.asList(charArray);
        for (char c : a) {
            list.add(c);
        }
    }

    /**
     * getChar removes a randomly generated index with the bound of current list size
     * and returns the removed character
     */
    public static char getChar() {
        Random randi = new Random(seed);
        int randomNumber = randi.nextInt(list.size());
        return list.remove(randomNumber);
    }

/**
 * hashMapGenerator generates and returns a hashmap with the key of all character from charArray
 * with a value of randomly removed chars from list
 * */
    public HashMap<String, String> hashMapGenerator() {

        HashMap<String, String> hash = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            String key = charArray[i]+"";
            String value = getChar()+"";
            hash.put(key, value);
        }
        return hash;
    }
}
