class Solution {
    public int minAddToMakeValid(String s) {
        int a = 0;
        int b = 0;

        for (Character cha : s.toCharArray()) {

            if (cha == '(') {
                a++;
            } else {
                if (a > 0) {
                    a--;
                } else {
                    b++;
                }
            }
        }

        return a + b;
    }
}