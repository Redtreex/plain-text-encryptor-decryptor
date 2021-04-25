import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * This class contains two methods only encryption and decryption
  */
public class EncryptDecrypt {
    String setOfCharacters = "`1q2w3e4r5t6y7u8i9o0p-=azsxdcfvgbhnjmk,l;/'~! Q@W#ER%TY&UIOP_AZSXDCFVGBHNJMK<L>:\"";
    char characterArray[] = setOfCharacters.toCharArray();

    /**
     * this method returns takes message string and an array of randomly generated numbers
     * and returns the encrypted message
     */
    public String encryption(String message) {
        RandomGenerator rand = new RandomGenerator(characterArray);
        HashMap <String,String> hash = rand.hashMapGenerator();
        Set<String> k = hash.keySet();
        List<String> keys = new ArrayList<String>(k);
        String value ;
        String temp;
        String changed_values ="";
        String headerKeys = "",tailValues = "";
        for (int i = 0; i < keys.size(); i++) {
            value = hash.get(keys.get(i));
            String old = String.valueOf(keys.get(i));
            String latest = value;
            temp = message;
            message = message.replaceAll(old,latest+"");
            if(!temp.equals(message)) {
                keys.remove(latest);
                changed_values = changed_values+" "+old+"="+latest+",";
                headerKeys = headerKeys +latest;
                tailValues = tailValues +old;
                System.out.println("old: "+old+" ,latest: "+latest);
                System.out.println(message);
            }
        }
        message = headerKeys + message + tailValues;
        message = keys.size()+message;
        return message;
    }

    /**
     * this method returns takes encrypted message String returns the decrypted message
     */
    public String decryption(String encrypted) {
        String message = encrypted;
        int leftChars = Integer.parseInt(message.substring(0,2));
        message = message.substring(2);
        int length = 81-leftChars;
        String keyString = message.substring(0,length);
        String valueString = message.substring(message.length()-length);
        message = message.substring(length,message.length()-length);

        for (int i = length-1; i >= 0; i--) {
            message = message.replaceAll(keyString.charAt(i)+"",valueString.charAt(i)+"");
            //System.out.println(message);
        }

        System.out.println(length+" "+ keyString.length()+" "+valueString.length());
        return message;
    }

}
