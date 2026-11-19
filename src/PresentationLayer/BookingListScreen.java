package PresentationLayer;

import BusinessLogicLayer.BookingService;
import BusinessLogicLayer.ReceiptService;
import Models.Booking;
import Utilities.ConsoleHelper;
import Utilities.InputValidator;

public class BookingListScreen extends BaseScreen {
    private final BookingService bookings;
    private final ReceiptService receipts;

    public BookingListScreen(BookingService bookings, ReceiptService receipts) {
        this.bookings = bookings;
        this.receipts = receipts;
    }

    @Override
    public void show() {
        while (true) {
            ConsoleHelper.header("LIST OF BOOKING");
            list();
            System.out.println("\n[1] Reserve   [2] Print Receipt   [0] Back");
            try {
                switch (InputValidator.readInt("Choose: ")) {
                    case 1:
                        bookings.reserve(InputValidator.readInt("Booking ID: "));
                        System.out.println("Booking reserved.");
                        break;
                    case 2:
                        System.out.println();
                        System.out.println(receipts.generate(InputValidator.readInt("Booking ID: ")));
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

   
}
