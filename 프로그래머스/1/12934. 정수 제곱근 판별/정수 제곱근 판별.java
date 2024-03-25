class Solution {
    public long solution(long n) {
        final double x = Math.sqrt(n);
        return Math.pow((long) x, 2) == n ? (long) Math.pow(x + 1, 2) : -1;
    }
}