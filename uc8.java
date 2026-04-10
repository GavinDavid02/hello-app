/**
 * UC8: Use Map for Character Patterns and Render via Function
 * 
 * This program uses HashMap to store character patterns
 * and dynamically prints banner text like "OOPS".
 * 
 * @author YourName
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Get character patterns map
        Map<Character, String[]> patternMap = getCharacterPatterns();

        // Step 2: Print banner
        printBanner("OOPS", patternMap);
    }

    /**
     * Creates and returns a map of character patterns
     */
    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        // O pattern
        map.put('O', new String[]{
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        });

        // P pattern
        map.put('P', new String[]{
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        });

        // S pattern
        map.put('S', new String[]{
            "  *****  ",
            " *     * ",
            "*        ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        });

        return map;
    }

    /**
     * Prints banner for any given word
     */
    public static void printBanner(String text, Map<Character, String[]> map) {

        // Convert to uppercase for consistency
        text = text.toUpperCase();

        // Loop through 7 rows
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Loop through each character
            for (char ch : text.toCharArray()) {

                if (map.containsKey(ch)) {
                    line.append(map.get(ch)[i]).append(" ");
                } else {
                    // Handle unknown characters
                    line.append("         ").append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }
}