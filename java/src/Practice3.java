public class Practice3 {
    public static void main(String[] args) {

        // =========================================================
        // 1. Найти min/max и среднее в int[]
        // =========================================================
        int[] scores = {78, 91, 65, 88, 73};

        int min = scores[0];
        int max = scores[0];
        int sum = 0;

        for (int x : scores) {
            if (x < min) min = x;
            if (x > max) max = x;
            sum += x;
        }
        double avg = (double) sum / scores.length;

        System.out.println("=== 1-ТАПСЫРМА: int[] ===");
        System.out.println("Ең кіші мән (min): " + min);
        System.out.println("Ең үлкен мән (max): " + max);
        System.out.println("Орташа мән (среднее): " + avg);
        System.out.println();

        // =========================================================
        // 2. Для int[][] посчитать сумму каждой строки и каждого столбца
        // =========================================================
        int[][] matrix = {
                {78, 91, 88},
                {65, 72, 70},
                {90, 94, 89}
        };

        System.out.println("=== 2-ТАПСЫРМА: int[][] қосындысы ===");

        // Әр жолдың (строка) қосындысын табу
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                rowSum += matrix[row][col];
            }
            System.out.println("Жол (строка) " + row + " қосындысы: " + rowSum);
        }

        // Әр бағанның (столбец) қосындысын табу
        int numCols = matrix.length;
        for (int col = 0; col < numCols; col++) {
            int colSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                colSum += matrix[row][col];
            }
            System.out.println("Баған (столбец) " + col + " қосындысы: " + colSum);
        }
        System.out.println();

        // =========================================================
        // 3. Разбить CSV-подобную строку через split и вывести поля
        // =========================================================
        String csvLine = "Java,Python,C++,JavaScript,Go";
        String[] languages = csvLine.split(",");

        System.out.println("=== 3-ТАПСЫРМА: CSV split ===");
        for (int i = 0; i < languages.length; i++) {
            System.out.println("Өріс " + (i + 1) + ": " + languages[i]);
        }
        System.out.println();

        // =========================================================
        // 4. Подсчитать слова, удовлетворяющие условию
        // (Шарт: ұзындығы 4 таңбадан асатын сөздерді санау)
        // =========================================================
        int count = 0;
        for (String word : languages) {
            if (word.length() > 4) {
                count++;
            }
        }

        System.out.println("=== 4-ТАПСЫРМА: Шарт бойынша сөздерді санау ===");
        System.out.println("Ұзындығы 4 таңбадан асатын сөздер саны: " + count);
        System.out.println();

        // =========================================================
        // 5 & 6. Собрать отчёт через StringBuilder и обработать без List/Map
        // =========================================================
        StringBuilder report = new StringBuilder();
        report.append("=== ИТОГОВЫЙ ОТЧЁТ ===\n");
        report.append("Обработано элементов массива: ").append(scores.length).append("\n");
        report.append("Найдено слов по условию: ").append(count).append("\n");
        report.append("Список языков программирования:\n");

        for (String lang : languages) {
            report.append("- ").append(lang).append("\n");
        }
        report.append("Статус: Обработка успешно завершена без использования List/Map!");

        System.out.println("=== 5 жəне 6-ТАПСЫРМА: StringBuilder Отчёт ===");
        System.out.println(report.toString());
    }
}
