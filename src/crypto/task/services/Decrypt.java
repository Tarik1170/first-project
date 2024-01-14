package crypto.task.services;

import crypto.task.alphabet.TextTransisition;

import java.io.*;
import java.util.Collections;

public class Decrypt {
    private TextTransisition textTransisition = new TextTransisition();

    public void decrypt(File file, int key) {

        try {
            String encryptedText = readFile(file);

            String decryptedText = textTransisition.transLettersLeft(key, encryptedText);

            writeToFile(file, decryptedText);
        } catch (IOException e) {
            System.out.println("An error occurred during decryption.");
        }
    }

    private String readFile(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private void writeToFile(File file, String content) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }
    }
}
