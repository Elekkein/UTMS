package UTMS;

//Base Vehicle class
abstract class Vehicle {
	 private String registrationNumber;
	 private String make;
	 private String model;
	 private int capacity;
	 private Driver assignedDriver;
	
	 public Vehicle(String registrationNumber, String make, String model, int capacity) {
	     this.registrationNumber = registrationNumber;
	     this.make = make;
	     this.model = model;
	     this.capacity = capacity;
	 }
	
	 // Getter methods
	 public String getRegistrationNumber() { return registrationNumber; }
	 public String getMake() { return make; }
	 public String getModel() { return model; }
	 public int getCapacity() { return capacity; }
	 public Driver getAssignedDriver() { return assignedDriver; }
	
	 // Setter methods
	 public void assignDriver(Driver driver) {
	     this.assignedDriver = driver;
	     System.out.println("Driver " + driver.getName() + " assigned to vehicle " + registrationNumber);
	 }
	
	 // Overloaded method for principle (vii)
	 public void assignDriver(Driver driver, String shiftTime) {
	     this.assignedDriver = driver;
	     System.out.println("Driver " + driver.getName() + " assigned to vehicle " + 
	                       registrationNumber + " for shift: " + shiftTime);
	 }
	
	 public abstract void displayDetails();
}
