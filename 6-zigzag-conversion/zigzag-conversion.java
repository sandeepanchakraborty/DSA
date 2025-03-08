class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s; // Simplified early return

        int cycleLen = (numRows * 2) - 2; // More descriptive name
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < s.length(); j += cycleLen) {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < s.length()) {
                    sb.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return sb.toString();
    }
}