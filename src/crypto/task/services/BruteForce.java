package crypto.task.services;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BruteForce {
    private Decrypt decryptService = new Decrypt();
    private String addBruteForce(int key) {
        return "#";
    }
    private Map<String, Integer> bruteForceSymbols() {
        Map <String, Integer> map = new HashMap<>();

        map.put("$", 1);
        map.put("*", 2);
        map.put("^", 3);
        map.put("#", 4);
        map.put("%", 5);
        return map;

    }

    public void decrypt(String fileName) {
        int key = 4;
        decryptService.decrypt(new File(fileName), key);
        String encryptedText = readFile(fileName);

        // Assuming you want to use brute force symbols to decrypt
        for (Map.Entry<String, Integer> entry : bruteForceSymbols().entrySet()) {
             key = entry.getValue();
            String decryptedText = attemptDecryption(key, encryptedText);
            System.out.println("Key " + key + ": " + decryptedText);
        }
    }

    private String attemptDecryption(int key, String encryptedText) {
        // Implement your decryption logic here using the provided key
        // You can replace this with your actual decryption method
        // Modify this method as per your decryption requirements
        return "Decrypted Text using Key " + key;
    }

    private String readFile(String fileName) {
        // Implement your file reading logic here
        // Return the content of the file as a string
        // Modify this method based on your requirements
        return "Encrypted Text from File";
    }
}

