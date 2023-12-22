import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int flight1fullCapacity = 3;
        int flight2fullCapacity = 2;

        int flight1CurrCapacity = 0;
        int flight2CurrCapacity = 0;

        int flight1BookCost = 5000;
        int flight2BookCost = 5000;
        ArrayList<Passenger> tickets = new ArrayList<>();

//        booking
//        cancellation
//        printing
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Booking\n2.Cancellation\n3. Print booking details");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    System.out.println("Enter passenger name : ");
                    String psgName = scanner.nextLine();
                    System.out.println("Enter passenger age : ");
                    int psgAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter flight Id : ");
                    int flyid = Integer.parseInt(scanner.nextLine());

                    int currCap = -1;
                    if (flyid == 1) {
                        if (flight1CurrCapacity == flight1fullCapacity){
                            System.out.println("All tickets sold out");
                            break;
                        }
                        flight1CurrCapacity++;
                        currCap = flight1CurrCapacity;
                    }
                    else if (flyid == 2) {
                        if (flight2CurrCapacity == flight2fullCapacity){
                            System.out.println("All tickets sold out");
                            break;
                        }
                        flight2CurrCapacity++;
                        currCap = flight2CurrCapacity;
                    }
                    else {
                        System.out.println("Flight not found!");
                        break;
                    }

                    Passenger psgdetail = new Passenger(psgName, psgAge, new Booking(flyid, currCap));
                    tickets.add(psgdetail);
                    System.out.println("Tickets booked successfully your flight id "+
                            psgdetail.getBooking().getFlightId()
                            +" your seat no : " + psgdetail.getBooking().getSeatNo());
                    break;
                case 3:
                    System.out.println("Enter flight ID : ");
                    int flyid1 = Integer.parseInt(scanner.nextLine());
                    for (Passenger p : tickets){
                        if (p.getBooking().getFlightId() == flyid1){
                            System.out.println(p);
                        }
                    }
            }
        }
    }
}
