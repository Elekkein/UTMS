package UTMS;

public class Student extends User {
    private String studentId;
    private String course;

    public Student(String userId, String name, String email, String password, 
                  String studentId, String course) {
        super(userId, name, email, password);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void requestTransport(String destination) {
        System.out.println("Student " + getName() + " requesting transport to " + destination + 
                          " for academic purposes");
        // Additional student-specific logic
    }

    public void requestTransport(String destination, String reason) {
        System.out.println("Student " + getName() + " requesting transport to " + destination + 
                          " for reason: " + reason);
    }
}