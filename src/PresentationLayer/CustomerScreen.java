package PresentationLayer;

import BusinessLogicLayer.CustomerService;
import Models.Customer;
import Utilities.ConsoleHelper;
import Utilities.InputValidator;

public class CustomerScreen extends BaseScreen {
    private final CustomerService service;

    public CustomerScreen(CustomerService service) { this.service = service; }

    @Override
    public void show() {
        while (true) {
            ConsoleHelper.header("MANAGE CUSTOMER");
            System.out.println("[1] View Customers");
            System.out.println("[2] Add Customer");
            System.out.println("[3] Remove Customer");
            System.out.println("[0] Back");
            try {
                switch (InputValidator.readInt("\nChoose: ")) {
                    case 1: list(); break;
                    case 2:
                        service.add(InputValidator.readString("Name: "), InputValidator.readString("Contact: "));
                        System.out.println("Customer added.");
                        break;
                    case 3:
                        list();
                        int id = InputValidator.readInt("Customer ID to remove: ");
                        System.out.println(service.remove(id) ? "Removed." : "Customer not found.");
                        break;
                    case 0: return;
                    default: System.out.println("Invalid choice.");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            ConsoleHelper.pause();
        }
    }

    private void list() {
        System.out.println();
        for (Customer c : service.getAll()) System.out.println(c);
    }
}
