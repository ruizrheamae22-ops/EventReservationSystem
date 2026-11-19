package PresentationLayer;

import BusinessLogicLayer.AuthService;
import Utilities.ConsoleHelper;
import Utilities.InputValidator;

public class LoginScreen extends BaseScreen {
    private final AuthService auth;
    private final DashboardScreen dashboard;

    public LoginScreen(AuthService auth, DashboardScreen dashboard) {
        this.auth = auth;
        this.dashboard = dashboard;
    }

    @Override
    public void show() {
        while (true) {
            ConsoleHelper.header("KISSBONE COVE - EVENT RESERVATION");
            System.out.println("Southern Leyte\n");
            System.out.println("[1] Admin Login");
            System.out.println("[0] Exit");
            int choice = InputValidator.readInt("\nChoose: ");
            if (choice == 0) { System.out.println("Goodbye!"); return; }
            if (choice == 1 && login()) dashboard.show();
        }
    }

    private boolean login() {
        for (int attempt = 1; attempt <= 3; attempt++) {
            ConsoleHelper.header("ADMIN LOGIN");
            String user = InputValidator.readString("Username: ");
            String pass = InputValidator.readString("Password: ");
            if (auth.login(user, pass)) return true;
            System.out.println("Wrong credentials (" + attempt + "/3).");
            ConsoleHelper.pause();
        }
        return false;
    }
}
