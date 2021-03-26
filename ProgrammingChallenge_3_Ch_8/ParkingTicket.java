/**
 * 
 * This class simulates parking tickets
 *
 */
class ParkingTicket {

	private ParkedCar car;
	private int minutes;
	private int minPay;
	private final int FIRST_HOUR_FINE = 25;
	private final int ADD_FINE_PER_HOUR = 10;
	private PoliceOfficer names;

	public ParkingTicket(ParkedCar mycar, int minsStayed, int minsPaidFor, PoliceOfficer details) {

		car = mycar;
		minutes = minsStayed;
		minPay = minsPaidFor;
		names = details;
	}

	/**
	 * 
	 * @param parkedCar   //set parked car object instances
	 * @param totalMins   //set mins stayed
	 * @param totalPaid   //set mintues paid
	 * @param fullDetails //set police officer details
	 */
	public void setTicket(ParkedCar parkedCar, int totalMins, int totalPaid, PoliceOfficer fullDetails) {
		car = parkedCar;
		minutes = totalMins;
		minPay = totalPaid;
		names = fullDetails;
	}

	/**
	 * 
	 * @param minsStayed //hold minutes stayed by car
	 * @param paidMins   //hold minutes paid by driver
	 * @return fine //return fine on the car
	 */
	public String getTicket(int minsStayed, int paidMins) {
		int fine = 0;
		int extraHour;
		int extraCost;
		String str = "";

		// check if minutes are expired
		if (!(minsStayed == paidMins)) {
			// if minutes stayed are greater than 59
			if (minsStayed > 60) {

				// pay first hour plus additional fees minus hour paid
				extraHour = (minsStayed - paidMins) / 60;
				extraCost = ((extraHour - 1) * ADD_FINE_PER_HOUR);
				fine = (FIRST_HOUR_FINE + extraCost);
				str = "Fine amount: $" + fine;

				// if minutes are 1-60
			} else if (minsStayed < 60 && minsStayed > 0 && minsStayed > paidMins) {

				// Pay first hour fine
				str = "Fine amount: $" + FIRST_HOUR_FINE;

			} else if (minsStayed <= paidMins) {
				// if time is not expired yet
				fine = 0;
				str = "Fine amount: $" + fine;
			}

		} else if (minsStayed == paidMins) {
			fine = 0;
			str = "Fine amount: $" + fine;
		}
		// return fine
		return str;
	}

}
