package UTMS;

//Van class implementing interfaces
class Van extends Vehicle implements Serviceable, Trackable {
 private boolean hasAirConditioning;
 private String currentLocation;

 public Van(String registrationNumber, String make, String model, 
           int capacity, boolean hasAirConditioning) {
     super(registrationNumber, make, model, capacity);
     this.hasAirConditioning = hasAirConditioning;
 }

 // Serviceable interface methods
 @Override
 public void performMaintenance() {
     System.out.println("Performing maintenance on van " + getRegistrationNumber());
 }

 @Override
 public boolean isDueForService() {
     // Simplified logic
     return Math.random() > 0.5;
 }

 // Trackable interface methods
 @Override
 public void updateLocation(String location) {
     this.currentLocation = location;
     System.out.println("Van " + getRegistrationNumber() + " now at: " + location);
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void displayDetails() {
     System.out.println("Van Details:");
     System.out.println("Registration: " + getRegistrationNumber());
     System.out.println("Make/Model: " + getMake() + " " + getModel());
     System.out.println("Capacity: " + getCapacity());
     System.out.println("AC: " + (hasAirConditioning ? "Yes" : "No"));
 }
}