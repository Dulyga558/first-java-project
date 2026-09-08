public class Main {

    static int readChoice() {
        return 3;
    }

    public static void main(String[] args) {
        int choice;
        do {
            choice = readChoice();
            System.out.println("Выбран пункт меню: " + choice);
        } while (choice < 1 || choice > 5);
    }
}