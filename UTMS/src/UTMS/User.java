package UTMS;

public abstract class User {
	 // Private fields (Encapsulation)
    private String userId;
    private String name;
    private String email;
    private String password;

    // Constructor
    public User(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter methods (Access Control)
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Setter methods (Data Validation)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Abstract method (Must be implemented by subclasses)
    public abstract void requestTransport(String destination);
}
