public class Main {
    static int readNumber() { return 17; }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void printAnswer(int n, boolean prime) {
        System.out.println("Число " + n + (prime ? " простое" : " составное"));
    }

    public static void main(String[] args) {
        int n = readNumber();
        boolean prime = isPrime(n);
        printAnswer(n, prime);
    }
}