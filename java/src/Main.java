public class Main {
    static void process(int row, int col) {
        System.out.println("Элемент сетки: строка " + row + ", колонка " + col);
    }

    public static void main(String[] args) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                process(row, col);
            }
        }
    }
}