class Solution {
    public int ProductCalculation(int num) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num = num / 10;
        }
        return product;
    }

    public int smallestNumber(int n, int t) {
        int temp = n;
        // boolean flag = true;
        // int product = 0;
        while (!(ProductCalculation(temp) % t == 0)) {
            temp++;
        }
        // product = ProductCalculation(temp);
        return temp;
    }
}