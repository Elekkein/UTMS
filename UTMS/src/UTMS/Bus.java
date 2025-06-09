package UTMS;

//Bus class implementing interfaces
class Bus extends Vehicle implements Serviceable, Trackable, Schedulable {
 private String busType;
 private String currentLocation;
 private Route currentRoute;

 public Bus(String registrationNumber, String make, String model, 
            int capacity, String busType) {
     super(registrationNumber, make, model, capacity);
     this.busType = busType;
 }

 // Serviceable interface methods
 @Override
 public void performMaintenance() {
     System.out.println("Performing maintenance on bus " + getRegistrationNumber());
 }

 @Override
 public boolean isDueForService() {
     // Simplified logic - in real system would check mileage/service records
     return Math.random() > 0.7;
 }

 // Trackable interface methods
 @Override
 public void updateLocation(String location) {
     this.currentLocation = location;
     System.out.println("Bus " + getRegistrationNumber() + " now at: " + location);
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 // Schedulable interface methods
 @Override
 public void assignToRoute(Route route) {
     this.currentRoute = route;
     System.out.println("Bus " + getRegistrationNumber() + " assigned to route: " + 
                       route.getRouteName());
 }

 @Override
 public void removeFromRoute() {
     System.out.println("Bus " + getRegistrationNumber() + " removed from route: " + 
                       currentRoute.getRouteName());
     this.currentRoute = null;
 }

 @Override
 public void displayDetails() {
     System.out.println("Bus Details:");
     System.out.println("Registration: " + getRegistrationNumber());
     System.out.println("Make/Model: " + getMake() + " " + getModel());
     System.out.println("Capacity: " + getCapacity());
     System.out.println("Type: " + busType);
 }
}