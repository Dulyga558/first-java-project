public class Main {
    static String readName() { return "Алексей"; }
    static int calculateScore() { return 85; }
    static void printResult(String name, int score) {
        System.out.println("Студент " + name + " получил балл: " + score);
    }

    public static void main(String[] args) {
        String name = readName();
        int score = calculateScore();
        printResult(name, score);
    }
}