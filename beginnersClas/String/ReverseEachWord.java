package String;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "I am SDET";

        // Step 1: Split the sentence into words
        String[] words = str.split(" ");

        // Step 2: Reverse characters in each word
        String reversedSentence = "";
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversedSentence += reversedWord + " ";
        }

        // Step 3: Trim and print the result
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversedSentence.trim());
    }
}