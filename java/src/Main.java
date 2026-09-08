public class Main {
    public void main(String[] args) {
        int age=20;
        boolean adult = age >= 18;
        boolean hasTicket = true;
        boolean enter = adult && hasTicket;
        boolean discount = age < 18 || age > 65;
        boolean blocked = !hasTicket;
    }
}