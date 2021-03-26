
/**
 * This class simulates a parked car
 */
class ParkedCar {
	private String make; // hold car make details
	private String model; // hold car model details
	private String color; // hold car color details
	private String licenseNumber; // hold license number
	private int minutesParked; // hold minutes lasted

	/**
	 * Constructor to initialize car details
	 * 
	 * @param carMake
	 * @param carModel
	 * @param carColor
	 * @param licence
	 * @param minutes
	 */
	public ParkedCar(String carMake, String carModel, String carColor, String license, int minutes) {
		make = carMake;
		model = carModel;
		color = carColor;
		licenseNumber = license;
		minutesParked = minutes;
	}

	/**
	 * copy constructor to deep copy parked car
	 * 
	 * @param carCopy copy of car object
	 */
	public ParkedCar(ParkedCar carCopy) {
		make = carCopy.make;
		model = carCopy.model;
		color = carCopy.color;
		licenseNumber = carCopy.licenseNumber;
		minutesParked = carCopy.minutesParked;
	}

	/**
	 * this method set the instances of the car object
	 * 
	 * @param mk
	 * @param md
	 * @param cl
	 * @param ln
	 * @param mins
	 */
	public void setParkedCar(String mk, String md, String cl, String ln, int mins) {
		make = mk;
		model = md;
		color = cl;
		licenseNumber = ln;
		minutesParked = mins;
	}

	/**
	 * return string of parked car details
	 */
	public String toString() {
		String str = "Car issued to: " + color + " " + make + " " + model + ", license #: " + licenseNumber
				+ "\nIssued by officer: ";

		return str;
	}

}