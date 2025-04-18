public class Solution {
    private String getRLE(String s) {
        StringBuilder ans = new StringBuilder();
        int cnt = 1;
        char prev = s.charAt(0);

        for (int pos = 1; pos < s.length(); pos++) {
            if (s.charAt(pos) == prev) {
                cnt++;
            } else {
                ans.append(cnt).append(prev);
                prev = s.charAt(pos);
                cnt = 1;
            }
        }

        ans.append(cnt).append(prev);
        return ans.toString();
    }

    public String countAndSay(int n) {
        String str = "1";

        for (int i = 1; i < n; i++) {
            str = getRLE(str);
        }

        return str;
    }
}