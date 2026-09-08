public class Main {
    static int value = 10;

    static void print(int value) {
        System.out.println("Параметр перекрыл поле: " + value);
    }

    public static void main(String[] args) {
        print(45);
    }
}