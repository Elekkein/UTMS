package UTMS;

public class Main {

	public static void main(String[] args) {
		// Create users
        Student student = new Student("S001", "Alice", "alice@vu.edu", "password", 
                                    "ST123", "Computer Science");
        Lecturer lecturer = new Lecturer("L001", "Dr. Smith", "smith@vu.edu", "prof123", 
                                      "EMP456", "Engineering");
        TransportOfficer officer = new TransportOfficer("T001", "John", "john@vu.edu", 
                                                     "secure123", "TO789", "Morning");

        // Demonstrate polymorphism in requestTransport
        User[] users = {student, lecturer, officer};
        for (User user : users) {
            user.requestTransport("Main Campus");
        }
        System.out.println();

        // Student-specific overloaded method
        student.requestTransport("City Campus", "Field trip");
        System.out.println();

        // Create vehicles
        Bus bus = new Bus("BUS123", "Mercedes", "Tourismo", 50, "Express");
        Van van = new Van("VAN456", "Ford", "Transit", 12, true);

        // Demonstrate interface implementations
        bus.performMaintenance();
        bus.updateLocation("Gate A");
        bus.assignToRoute(new Route("R1", "Main Route", "Hostel", "Campus", 
                                  new String[]{"Stop 1", "Stop 2"}));

        van.performMaintenance();
        van.updateLocation("Parking Lot");
        System.out.println();

        // Demonstrate method overriding in vehicle display
        bus.displayDetails();
        System.out.println();
        van.displayDetails();
        System.out.println();

        // Create driver and demonstrate overloading
        Driver driver1 = new Driver("D001", "Mike", "DL12345", "Heavy Vehicle");
        Driver driver2 = new Driver("D002", "Sarah", "DL67890", "Light Vehicle");

        bus.assignDriver(driver1);
        bus.assignDriver(driver2, "Evening Shift"); // Overloaded method
        System.out.println();

        // Check service status
        System.out.println("Bus needs service: " + bus.isDueForService());
        System.out.println("Van needs service: " + van.isDueForService());

	}

}
