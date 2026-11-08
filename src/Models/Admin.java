package Models;

public class Admin extends Person {
    private final String username;
    private final String password;

    public Admin(String name, String username, String password) {
        super(name, "");
        this.username = username;
        this.password = password;
    }

    public boolean matches(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }
}