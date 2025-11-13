public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        String s = "rat";
        String t = "atr";
        System.out.println("Are the given strings: " + s + " and " + t + " anagrams of each other:"
                + solution.isAnagram(s, t));
    }
}
