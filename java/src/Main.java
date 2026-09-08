public class Main {
    static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    static String labelFor(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        }
        if (isFizz(number)) {
            // Лекция 2 бойынша егер тек 3-ке бөлінсе
            return "Fizz";
        }
        if (isBuzz(number)) {
            // Лекция 2 бойынша егер тек 5-ке бөлінсе
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(labelFor(i));
        }
    }
}