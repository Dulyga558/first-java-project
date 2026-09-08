public class Main {
    public static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }

    public static void main(String[] args) {
        int result = max(15, 27);
        System.out.println("Максимальное число: " + result);
    }
}