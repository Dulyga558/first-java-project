public class Main {
    static void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int a = 5;
        change(a); // әдіске тек көшірмесін береміз
        System.out.println("Значение переменной 'a': " + a); // нәтиже бәрібір 5 болып қалады
    }
}