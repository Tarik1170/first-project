package crypto.task.services;

import crypto.task.alphabet.TextTransisition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BruteForceService {
    public void decrypt(String fileName) {
        //get file by name
        //analyse text and get key
        File file = new File(fileName);

        if (file.exists()) {
            try {
                String encryptedText = readFile(file);


                for (int key = 0; key < 26; key++) {
                    String decryptedText = attemptDecryption(key, encryptedText);
                    // You can perform further analysis or processing with the decryptedText
                    System.out.println("Key " + key + ": " + decryptedText);
                }
            } catch (IOException e) {
                System.out.println("An error occurred during brute force decryption.");
            }
        } else {
            System.out.println("File not found: " + fileName);
        }
    }

    private String readFile(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {

            }
        }
        return content.toString();
    }

    private String attemptDecryption(int key, String encryptedText) {
        TextTransisition textTransisition = new TextTransisition();
        return textTransisition.transLettersLeft(key, encryptedText);
    }
}
