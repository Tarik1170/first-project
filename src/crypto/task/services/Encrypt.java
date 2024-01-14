package crypto.task.services;

import crypto.task.alphabet.TextTransisition;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Encrypt {
    private TextTransisition textTransisition = new TextTransisition();
    private BruteForce bruteForce = new BruteForce();

    public void encrypt(File file, int key) {
        try {
            // Read data from the file
            String data = readFile(file);

            // Encrypt the data using the transLettersRight method
            String encryptedData = textTransisition.transLettersRight(key, data);

            // Write the encrypted data back to the file
            writeToFile(file, encryptedData);

            // Perform brute force decryption for demonstration purposes
            bruteForce.decrypt(file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred during encryption.");
        }
    }

    private String readFile(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        // Implement your file reading logic here
        // ...
        return content.toString();
    }

    private void writeToFile(File file, String content) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }
    }
}

