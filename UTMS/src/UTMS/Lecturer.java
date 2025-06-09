package UTMS;

//Lecturer subclass
public class Lecturer extends User {
 private String employeeId;
 private String department;

 public Lecturer(String userId, String name, String email, String password,
                String employeeId, String department) {
     super(userId, name, email, password);
     this.employeeId = employeeId;
     this.department = department;
 }

 @Override
 public void requestTransport(String destination) {
     System.out.println("Lecturer " + getName() + " requesting transport to " + destination + 
                       " for teaching/research purposes");
     // Additional lecturer-specific logic
 }
}