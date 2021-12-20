package symmetric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Symmetric {
    private final static String PADDING = "AES/ECB/PKCS5Padding";

    public static byte[] encrypt(SecretKey key, String text) {
        byte[] encryptedText;

        try {
            Cipher cipher = Cipher.getInstance(PADDING);
            byte[] visibleText = text.getBytes();

            cipher.init(Cipher.ENCRYPT_MODE, key);
            encryptedText = cipher.doFinal(visibleText);
        } catch (Exception e) {
            System.out.println("Error encrypting text: " + e.getMessage());
            return null;
        }

        return encryptedText;
    }

    public static byte[] decrypt(SecretKey key, byte[] encryptedText) {
        byte[] decryptedText;

        try {
            Cipher cipher = Cipher.getInstance(PADDING);
            cipher.init(Cipher.DECRYPT_MODE, key);
            decryptedText = cipher.doFinal(encryptedText);
        } catch (Exception e) {
            System.out.println("Error decrypting text: " + e.getMessage());
            return null;
        }

        return decryptedText;
    }

    public static void print(byte[] text) {
        int i = 0;
        for (; i < text.length - 1; i++) {
            System.out.print(text[i] + " ");
        }
        System.out.println(text[i] + " ");
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        final String ALGORITHM = "AES";

        System.out.println("Enter some text:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        System.out.println("Received text: " + input);
        System.out.println("Received bytes: ");
        print(input.getBytes());

        KeyGenerator keygen = KeyGenerator.getInstance(ALGORITHM);
        SecretKey secretKey = keygen.generateKey();

        byte[] encryptedText = encrypt(secretKey, input);
        System.out.println("Encrypted text: ");
        print(encryptedText);

        byte[] decryptedText = decrypt(secretKey, encryptedText);
        System.out.println("Decrypted text: ");
        print(decryptedText);

        System.out.println("Text: " + new String(decryptedText));
    }
}