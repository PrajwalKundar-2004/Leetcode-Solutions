class Solution {

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i <= n / i; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public int primePalindrome(int n) {

        if (n <= 11) {
            if (n <= 2) return 2;
            if (n <= 3) return 3;
            if (n <= 5) return 5;
            if (n <= 7) return 7;
            return 11;
        }

        for (int x = 1; x < 100000; x++) {

            int palindrome = x;
            int temp = x / 10;

            while (temp > 0) {
                palindrome = palindrome * 10 + temp % 10;
                temp /= 10;
            }

            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }

        return -1;
    }
}