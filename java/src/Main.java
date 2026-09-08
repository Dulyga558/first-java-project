public class Main {
    static void openAdminPanel() { System.out.println("Панель администратора открыта"); }
    static void openProfile() { System.out.println("Профиль пользователя открыт"); }
    static void showError() { System.out.println("Ошибка доступа"); }

    public static void main(String[] args) {
        String role = "ADMIN";

        switch (role) {
            case "ADMIN":
                openAdminPanel();
                break;
            case "USER":
                openProfile();
                break;
            default:
                showError();
        }
    }
}