package BusinessLogicLayer;

import Models.Admin;

public class AuthService {
    private final Admin admin = new Admin("Administrator", "admin", "admin123");

    public boolean login(String username, String password) {
        return admin.matches(username, password);
    }
}