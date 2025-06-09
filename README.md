# **University Transport Management System (UTMS) - Technical Documentation**

## **1. System Overview**
A Java-based application for managing university transport operations using core OOP principles.

**Key Features**
- User role management (Students, Lecturers, Transport Officers)
- Vehicle tracking and maintenance
- Route scheduling
- Driver assignment

## **2. Class Documentation**

### **Interfaces**
| Interface | Methods | Implementing Classes |
|-----------|---------|----------------------|
| `Serviceable` | `performMaintenance()`, `isDueForService()` | `Bus`, `Van` |
| `Trackable` | `updateLocation(String)`, `getCurrentLocation()` | `Bus`, `Van` |
| `Schedulable` | `assignToRoute(Route)`, `removeFromRoute()` | `Bus` |

### **Core Classes**
#### **User Hierarchy**
```java
abstract class User {
    // Fields: userId, name, email, password
    // Methods: requestTransport(), changePassword()
}

class Student extends User {
    // Additional: studentId, course
}

class Lecturer extends User {
    // Additional: employeeId, department
}

class TransportOfficer extends User {
    // Additional: officerId, shift
    // Unique: manageSchedule()
}
```

#### **Vehicle Hierarchy**
```java
abstract class Vehicle {
    // Fields: registrationNumber, make, model, capacity
    // Methods: assignDriver(), displayDetails()
}

class Bus extends Vehicle implements Serviceable, Trackable, Schedulable {
    // Additional: busType, currentRoute
}

class Van extends Vehicle implements Serviceable, Trackable {
    // Additional: hasAirConditioning
}
```

### **Supporting Classes**
| Class | Purpose | Key Fields/Methods |
|-------|---------|--------------------|
| `Driver` | Represents vehicle operators | `driverId`, `licenseNumber` |
| `Route` | Defines transport paths | `routeId`, `stops[]` |

## **3. UML Diagram**
```
+----------------+       +----------------+       +----------------+
|    <<Interface>>       |    <<Interface>>       |    <<Interface>>
|   Serviceable  |       |    Trackable   |       |   Schedulable  |
+----------------+       +----------------+       +----------------+
| +performMaint()|       | +updateLocation()|     | +assignToRoute()|
| +isDueForSvc() |       | +getLocation()  |     | +removeFromRoute()|
+----------------+       +----------------+       +----------------+
        ^                         ^                         ^
        |                         |                         |
+-------+-------+         +-------+-------+         +-------+
|     Bus       |         |      Van      |         | Route |
+---------------+         +---------------+         +-------+
| -busType      |         | -hasAC        |         | -stops|
+---------------+         +---------------+         +-------+
```

## **4. Usage Examples**

### **Creating Objects**
```java
// Create a driver
Driver driver = new Driver("D001", "John", "DL123", "Heavy");

// Create a bus
Bus campusBus = new Bus("BUS001", "Mercedes", "Tourismo", 50, "Shuttle");

// Create a student
Student alice = new Student("S001", "Alice", "alice@vu.edu", "pass123", "ST001", "CS");
```

### **System Operations**
```java
// Assign driver (method overloading)
campusBus.assignDriver(driver);
campusBus.assignDriver(driver, "Morning");

// Track vehicle
campusBus.updateLocation("Main Gate");
String location = campusBus.getCurrentLocation();

// User requests
alice.requestTransport("Library");
```

## **5. Design Patterns Used**
1. **Strategy Pattern** (via interfaces)
   - Different vehicles implement tracking differently
2. **Template Method** (abstract classes)
   - User provides template for all user types
3. **Observer Pattern** (potential extension)
   - Could notify users when vehicles arrive

## **6. Error Handling**
The system includes basic validation:
```java
public void setName(String name) {
    if (name == null || name.isEmpty()) {
        throw new IllegalArgumentException("Name cannot be empty");
    }
    this.name = name;
}
```

## **7. Future Enhancements**
1. Database integration for persistent storage
2. Mobile app interface using REST API
3. Real-time GPS tracking integration
4. Automated maintenance scheduling

## **8. Build & Run Instructions**
1. Compile all Java files:
   ```bash
   javac *.java
   ```
2. Run the system:
   ```bash
   java Main
   ```

## **9. Testing Approach**
Recommended test cases:
1. Verify driver assignment to vehicles
2. Test route scheduling constraints
3. Validate user transport requests
4. Check maintenance scheduling logic
