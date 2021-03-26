
/**
 * For this assignment you will design a set of classes that work together to 
 * simulate a police officer issuing a parking ticket. 
 * You should design the following classes:
 * 
 * The ParkedCar Class: This class should simulate a parked car. The class's responsibilities are as follows:
 * To know the car's make, model, color, license number, and the number of minutes
 * that the car has been parked.
 * The ParkingMeter Class: This class should simulate a parking meter. The class's only responsibility is as follows:
 * To know the number of minutes of parking time that has been purchased.
 * The ParkingTicket Class: This class should simulate a parking ticket. The class's responsibilities are as follows:
 * To report the make, model, color, and license number of the illegally parked car
 * To report the amount of the fine, which is $25 for the first hour or part of an hour that the car is illegally parked,
 *  plus $10 for every additional hour or part of an hour that the car is illegally parked
 * To report the name and badge number of the police officer issuing the ticket
 * 
 * The PoliceOfficer Class: This class should simulate a police officer inspecting parked cars. The class's responsibilities are as follows:
 * To know the police officer's name and badge number
 * To examine a ParkedCar object and a ParkingMeter object, and determine whether
 * the car's time has expired
 * To issue a parking ticket (generate a ParkingTicket object) if the car's time has
 * expired
 * 
 * Write a program that demonstrates how these classes collaborate. Make the aforementioned classes nested classes within
 * the class containing your main method; only this outermost class can be declared public.
 * 
 * @author Mark Kasule
 *
 */

import java.util.Scanner;

public class ParkingTicketSimulator {

	public static void main(String[] args) {

		System.out.println("===Parking Ticket Simulator===");
		System.out.println("");

		// CAR DATA
		System.out.println("-------------------------------");
		System.out.println("Car Data");
		System.out.println("-------------------------------");

		Scanner input = new Scanner(System.in);

		// ask officer for car details
		System.out.print("Enter car make: ");
		String currentMake = input.nextLine();
		System.out.print("Enter car model: ");
		String currentModel = input.nextLine();
		System.out.print("Enter car color: ");
		String currentColor = input.nextLine();
		System.out.print("Enter car licence number: ");
		String currentLicence = input.nextLine();
		System.out.print("Enter minutes car has been parked: ");
		int currentMin = input.nextInt();

		// create new car object
		ParkedCar car = new ParkedCar(currentLicence, currentLicence, currentLicence, currentLicence, currentMin);
		// set car instances
		car.setParkedCar(currentMake, currentModel, currentColor, currentLicence, currentMin);

		// METER DATA
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("Meter Data");
		System.out.println("-------------------------------");
		System.out.print("Enter minutes purchased by driver: ");
		int minutesPurchased = input.nextInt();

		// create meter object
		ParkingMeter meterReading = new ParkingMeter(minutesPurchased);
		// set the reading
		meterReading.setMinsPaid(minutesPurchased);
		int minsPaid = meterReading.getMinutes(); // hold the minutes paid

		// P.O DATA
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("P.O Data");
		System.out.println("-------------------------------");
		// ask officer's details
		System.out.print("Enter police officer's name: ");
		String officerName = input.next();
		input.next();
		System.out.print("Enter poilice officer's badge number: ");
		int badgeNumber = input.nextInt();

		// create new officer details
		PoliceOfficer details = new PoliceOfficer(officerName, badgeNumber);
		// set details of officer
		details.setOfficerDetails(officerName, badgeNumber);

		// PARKING TICKET ISSUED
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("Parking Ticket Issued");
		System.out.println("-------------------------------");
		// create object that receives car details, minutes paid, officer details
		ParkingTicket fined = new ParkingTicket(car, currentMin, minsPaid, details);

		// set the fined fees
		fined.setTicket(car, currentMin, minsPaid, details);

		// print ticket number, fine, car and officer details
		int ticketNumber = (int) (10000 + Math.random() * 20000);
		System.out.println("Parking ticket #: " + ticketNumber);
		System.out.println(fined.getTicket(currentMin, minsPaid));
		System.out.print(car); // car object
		System.out.println(details); // police officer details

	}

}
