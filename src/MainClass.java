import java.io.File;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String message = "";
        /**
        * set your txt file Path which contains plain text filePath variable
        */
        String filePath = "D:\\Github\\Java Projects\\EncryptorDecryptor\\src\\originalText.txt";
        try{
            File myFile = new File(filePath);
            Scanner scn = new Scanner(myFile);
            while (scn.hasNext()){
                message = message.concat(scn.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        EncryptDecrypt converter = new EncryptDecrypt();
        String encryptedMessage = converter.encryption(message);
        String decryptedMessage = converter.decryption(encryptedMessage);


        System.out.println("Original Message : "+message);
        System.out.println("Encrypted Message : "+encryptedMessage);
        System.out.println("Decrypted Message : "+decryptedMessage);


    }
}
