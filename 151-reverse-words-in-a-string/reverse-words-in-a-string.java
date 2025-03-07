class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            // Skip spaces
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if (end < 0) break;

            int start = end;
            // Move left to find the start of the word
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            // Append word
            for (int i = start + 1; i <= end; i++) {
                result.append(s.charAt(i));
            }
            result.append(" "); // Add space after word

            end = start; // Move to the next word
        }

        // Remove extra space at the end if present
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}