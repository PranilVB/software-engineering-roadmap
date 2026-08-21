public class 1541MinimumInsertionstoBalanceParentheses String {
    class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int ans = 0;

        for (char cha : s.toCharArray()) {

            if (cha == '(') {

                if (open % 2 == 1) {
                    ans++;
                    open--;
                }

                open += 2;

            } else {

                open--;

                if (open < 0) {
                    ans++;
                    open = 1;
                }
            }
        }

        return ans + open;
    }
}
}
