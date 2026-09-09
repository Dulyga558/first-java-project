public class Practice1 {
    public static void main(String[] args) {
        // Задание 3.1: Создание переменных
        String name = "Amina";
        int age = 19;
        double averageScore = 87.5;
        boolean javaStudent = true;
        char group = 'A';

        // Вывод всех данных в одной понятной строке
        System.out.println("Студент: " + name + ", Возраст: " + age +
                ", Средний балл: " + averageScore +
                ", Студент Java: " + javaStudent +
                ", Группа: " + group);

        /*
         * Ответы на вопросы к Заданию 3.1:
         * 1. Почему String начинается с большой буквы, а int — с маленькой?
         *    Ответ: String — это ссылочный тип (класс), а int — примитивный тип данных.
         * 2. Какой из типов выше является классом?
         *    Ответ: String.
         * 3. Какие четыре типа в примере являются примитивными?
         *    Ответ: int, double, boolean, char.
         */
    }
}