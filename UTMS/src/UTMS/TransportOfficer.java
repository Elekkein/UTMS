package UTMS;

//TransportOfficer subclass
public class TransportOfficer extends User {
 private String officerId;
 private String shift;

 public TransportOfficer(String userId, String name, String email, String password,
                        String officerId, String shift) {
     super(userId, name, email, password);
     this.officerId = officerId;
     this.shift = shift;
 }

 @Override
 public void requestTransport(String destination) {
     System.out.println("Transport Officer " + getName() + " requesting transport to " + 
                       destination + " for official duties");
     // Additional officer-specific logic
 }

 public void manageSchedule() {
     System.out.println("Transport Officer managing schedules");
 }
}