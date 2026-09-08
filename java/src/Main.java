public class Main {
    public static void main(String[] args) {
        int day = 6;

        String label = switch (day) {
            case 1, 2, 3, 4, 5 -> "Будний день";
            case 6, 7 -> "Выходной";
            default -> "Ошибка";
        };

        System.out.println("Сегодня: " + label);
    }
}