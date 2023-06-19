class Solution {

    /**
     * Checks if Geekina loves a string based on the ASCII order of its characters.
     *
     * @param N The length of the string.
     * @param S The input string.
     * @return 1 if Geekina loves the string, 0 otherwise.
     */
    public static int validString(int N, String S) {
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) < S.charAt(i - 1)) {
                // Geekina hates the string if a character with
                // lower ASCII value appears after a character with higher ASCII value
                return 0;
            }
        }
        return 1; // Geekina loves the string as all characters are in ascending order of their ASCII values
    }
}
