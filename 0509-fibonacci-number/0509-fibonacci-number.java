class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        // int sum = 0;
        for(int i = 1; i <= n; i++){
            int c = a + b;
            // sum = c;
            a = b;
            b = c;
        }
        return a;
    }
}