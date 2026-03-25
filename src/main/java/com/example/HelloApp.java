/**
 * UC7: Store Character Pattern in a Class
 * 
 * This program uses an inner static class to encapsulate
 * character patterns and prints "OOPS" banner.
 * 
 * @author YourName
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character The character
         * @param pattern The 7-line pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method to create O pattern
    public static CharacterPattern createOPattern() {
        return new CharacterPattern('O', new String[]{
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        });
    }

    // Utility method to create P pattern
    public static CharacterPattern createPPattern() {
        return new CharacterPattern('P', new String[]{
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        });
    }

    // Utility method to create S pattern
    public static CharacterPattern createSPattern() {
        return new CharacterPattern('S', new String[]{
            "  *****  ",
            " *     * ",
            "*        ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        });
    }

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPattern o = createOPattern();
        CharacterPattern p = createPPattern();
        CharacterPattern s = createSPattern();

        // Array of objects (OOPS)
        CharacterPattern[] word = {o, o, p, s};

        // Build and print banner using StringBuilder
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
}