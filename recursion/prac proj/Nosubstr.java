public class Nosubstr {
    public static int countContiguousSubstrings(String str) {
        return countSubstrings(str, 0, str.length() - 1);
    }

    private static int countSubstrings(String str, int start, int end) {
        // Base case: If the substring length is less than 2, return 0
        if (end - start + 1 < 2) {
            return 0;
        }

        // Recursive case: Count substrings starting and ending with the same character
        int count = countSubstrings(str, start + 1, end) + countSubstringsWithSameEnd(str, start, end);
        return count;
    }

    private static int countSubstringsWithSameEnd(String str, int start, int end) {
        // Base case: If start and end characters are the same, return 1
        if (str.charAt(start) == str.charAt(end)) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        String str = "ABABA";
        int count = countContiguousSubstrings(str);
        System.out.println("Count of contiguous substrings: " + count);
    }
}
