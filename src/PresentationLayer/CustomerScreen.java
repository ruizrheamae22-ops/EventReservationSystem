package PresentationLayer;

import BusinessLogicLayer.CustomerService;
import Models.Customer;
import Utilities.ConsoleHelper;
import Utilities.InputValidator;

public class CustomerScreen extends BaseScreen {
    private final CustomerService service;

    public CustomerScreen(CustomerService service) { this.service = service; }

    
}
