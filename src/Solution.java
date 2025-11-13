public class Solution {

    public boolean isAnagram(String s, String t) {
        /**
         * Check if the length are same or not? If they are not same, then the two
         * strings are not an anagram of each other.
         */
        if (s.length() != t.length()) {
            return false;
        }
        // Create an array to count character frequencies. Here, we assume that we only
        // get lowercase english alphabets
        int[] charCounts = new int[26];

        // increment the count for each character read in 's' and decrement the count
        // for each character read in 't'
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        // check if the count is zero, If yes, then the given strings are anagrams of
        // each other.
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;// Both strings are anagrams of each other.

    }
}
