class Solution {
    boolean solution(String s) {
        int numP = 0, numY = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == 'p') numP++;
            else if (ch == 'y') numY++;
        }
        return numP == numY;
    }
}