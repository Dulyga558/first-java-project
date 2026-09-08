public class Main {
    public static void main(String[] args) {
        int score = 82;
        String grade;

        if (score >= 90) grade = "A";
        else if (score >= 75) grade = "B";
        else if (score >= 50) grade = "C";
        else grade = "F";

        System.out.println("Ваша оценка: " + grade);
    }
}