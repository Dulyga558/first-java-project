public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue; // 5-ті басып шығармайды, келесі қадамға өтеді
            if (i == 8) break;    // 8-ге жеткенде цикл толығымен аяқталады
            System.out.println(i);
        }
    }
}