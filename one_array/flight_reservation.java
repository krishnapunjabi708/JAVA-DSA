import java.util.Scanner;

// Class to represent a reservation request
class ReservationRequest {
    String passengerName;
    String flightNumber;
    String seatPreference;

    public ReservationRequest(String passengerName, String flightNumber, String seatPreference) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.seatPreference = seatPreference;
    }

    // @Override
    public String toString() {
        return "Passenger: " + passengerName + ", Flight: " + flightNumber + ", Seat Preference: " + seatPreference;
    }
}

// Class to manage the reservation system using arrays
public class flight_reservation{
    private static final int MAX_RESERVATIONS = 100;//100 seats
    private static ReservationRequest[] reservationArray = new ReservationRequest[MAX_RESERVATIONS];
    private static int numReservations = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Reservation");
            System.out.println("2. View Next Reservation");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Display All Reservations");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addReservation();
                    break;
                case 2:
                    viewNextReservation();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    displayAllReservations();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addReservation() {
        if (numReservations >= MAX_RESERVATIONS) {
            System.out.println("Cannot add more reservations. Maximum limit reached.");
            return;
        }

        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        System.out.print("Enter seat preference: ");
        String seatPreference = scanner.nextLine();
        ReservationRequest request = new ReservationRequest(passengerName, flightNumber, seatPreference);
        reservationArray[numReservations++] = request;
        System.out.println("Reservation added: " + request);
    }

    private static void viewNextReservation() {
        if (numReservations == 0) {
            System.out.println("No reservations.");
        } else {
            ReservationRequest nextReservation = reservationArray[0];
            System.out.println("Next reservation: " + nextReservation);
        }
    }

    private static void cancelReservation() {
        if (numReservations == 0) {
            System.out.println("No reservations to cancel.");
        } else {
            ReservationRequest canceledReservation = reservationArray[0];
            for (int i = 0; i < numReservations - 1; i++) {
                reservationArray[i] = reservationArray[i + 1];
            }
            reservationArray[numReservations - 1] = null;
            numReservations--;
            System.out.println("Canceled reservation: " + canceledReservation);
        }
    }

    private static void displayAllReservations() {
        if (numReservations == 0) {
            System.out.println("No reservations.");
        } else {
            System.out.println("All reservations:");
            for (int i = 0; i < numReservations; i++) {
                System.out.println(reservationArray[i]);
            }
        }
    }
}
