/**
 * This class simulate a parking meter
 */
class ParkingMeter {

	private int minutesPaid; // holds minutes paid

	/**
	 * constructor to initialize minutes paid
	 */
	public ParkingMeter(int minsPaid) {
		minutesPaid = minsPaid;
	}

	/**
	 * copy constructor to deep copy
	 * 
	 * @param ParkingMeter copy of object
	 */
	public ParkingMeter(ParkingMeter meter) {
		minutesPaid = meter.minutesPaid;
	}

	/**
	 * set the minutes paid by driver
	 * 
	 * @param minutesPaid
	 */
	public void setMinsPaid(int paidMinutes) {
		minutesPaid = paidMinutes;
	}

	/**
	 * @return minutesPaid by the driver
	 */
	public int getMinutes() {
		return minutesPaid;
	}

}
