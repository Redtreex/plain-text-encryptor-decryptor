import java.util.Arrays;

/*
 * This class contains two methods only encryption and decryption
 * */
public class EncryptDecrypt {
    String setOfCharacters = "`1q2w3e4r5t6y7u8i9o0p-[=]\\azsxdcfvgbhnjmk,l.;/'~! Q@W#E$R%T^Y&U*I(O)P_{+}|AZSXDCFVGBHNJMK<L>:?\"";
    char characterArray[] = setOfCharacters.toCharArray();

    /*
     * this method returns takes message string and an array of randomly generated numbers
     * and returns the encrypted message
     * */
    public String encryption(String message) {
        RandomGenerator rand = new RandomGenerator();
        int rr[] = rand.RandomNumArray();


        return null;
    }

    /*
     * this method returns takes encrypted message String and the same array of numbers which was
     * used to encrypt it and returns the decrypted message
     * */
    public String decryption(String encrypted) {


        return null;
    }

}
