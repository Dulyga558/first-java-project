public class Practice1 {
    public static void main(String[] args) {
        // Задание 3.2. Арифметика
        int a = 17;
        int b = 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        /*
         * Ответы и предсказания к Заданию 3.2:
         * 1. Предсказание значения a / b (17 / 5):
         *    Результат = 3, так как при делении целых чисел (int) в Java
         *    дробная часть отбрасывается.
         * 2. Предсказание значения a % b (17 % 5):
         *    Результат = 2, так как остаток от деления 17 на 5 равен 2 (17 = 5 * 3 + 2).
         */
    }
}