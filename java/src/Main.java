class User {
    boolean active = true;
    boolean isActive(){
        return active;
    }
}
public class Main {
    public void main(String[] args) {
        User user = new User();
        if (user !=null && user.isActive()) {
            System.out.println("Access granted");
        }
    }
}