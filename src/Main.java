public class Main {

    // 1-ҚАДАМ: 3-ке бөлінетінін тексеретін әдіс [1]
    static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    // 2-ҚАДАМ: 5-ке бөлінетінін тексеретін әдіс [1, 2]
    static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    // 3-ҚАДАМ: Сөздерді құрастыратын әдіс [2]
    static String labelFor(int number) {
        // Егер 3-ке де, 5-ке де бөлінсе (мысалы 15) [2]
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        }
        // Егер тек 3-ке бөлінсе [2]
        if (isFizz(number)) {
            return "Fizz";
        }
        // Егер тек 5-ке бөлінсе [2]
        if (isBuzz(number)) {
            return "Buzz";
        }
        // Ешқайсысына бөлінбесе, санның өзін String (мәтін) қылып қайтарамыз [2]
        return String.valueOf(number);
    }

    // 4-ҚАДАМ: Бағдарламаны іске қосатын негізгі әдіс пен цикл [1]
    public static void main(String[] args) {
        // 1-ден 100-ге дейін цикл жүргіземіз
        for (int i = 1; i <= 100; i++) {
            // Әр санның FizzBuzz нәтижесін экранға шығарамыз
            System.out.println(labelFor(i));
        }
    }
}