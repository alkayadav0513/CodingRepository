package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "swiss";
        Character result = findFirstNonRepeatedChar(input);

        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static Character findFirstNonRepeatedChar(String str) {
        // LinkedHashMap preserves insertion order
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Step 1: Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first character with count = 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If all characters are repeated
        return null;
    }
}