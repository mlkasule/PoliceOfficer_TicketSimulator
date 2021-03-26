/**
 * This class simulates the police officer simulating parked cars
 */
class PoliceOfficer {
	private String fullName; // hold names of officer
	private int badgeNumber; // hold badge number

	/**
	 * constructor to initialize police officer details
	 * 
	 * @param names
	 * @param badge
	 */
	public PoliceOfficer(String names, int badge) {
		fullName = names;
		badgeNumber = badge;
	}

	/**
	 * copy constructor to deep copy officer details
	 * 
	 * @param details
	 */
	public PoliceOfficer(PoliceOfficer details) {
		fullName = details.fullName;
		badgeNumber = details.badgeNumber;
	}

	/**
	 * set the officer's details
	 * 
	 * @param names
	 * @param badge
	 */
	public void setOfficerDetails(String names, int badge) {
		fullName = names;
		badgeNumber = badge;
	}

	/**
	 * @param str returns officer details
	 */
	public String toString() {
		String str = fullName + ", badge #: " + badgeNumber;
		return str;
	}
}