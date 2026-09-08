public class Main {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Сумма int: " + sum(10, 20));
        System.out.println("Сумма double: " + sum(10.5, 20.5));
    }
}