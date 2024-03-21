class Solution {
    public int solution(int n) {
        int sum = 0;
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i + n / i;
            }
        }
        
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            sum -= Math.sqrt(n);
        }
        
        return sum;
    }
}