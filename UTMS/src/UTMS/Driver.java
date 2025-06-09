package UTMS;

//Driver class
class Driver {
 private String driverId;
 private String name;
 private String licenseNumber;
 private String licenseType;

 public Driver(String driverId, String name, String licenseNumber, String licenseType) {
     this.driverId = driverId;
     this.name = name;
     this.licenseNumber = licenseNumber;
     this.licenseType = licenseType;
 }

 // Getter methods
 public String getDriverId() { return driverId; }
 public String getName() { return name; }
 public String getLicenseNumber() { return licenseNumber; }
 public String getLicenseType() { return licenseType; }

 // Setter methods with validation
 public void setLicenseNumber(String licenseNumber) {
     if (licenseNumber != null && licenseNumber.matches("[A-Z0-9]+")) {
         this.licenseNumber = licenseNumber;
     }
 }
}
