// Class representing a User with different access modifiers for its fields
class User {
    // Private field: accessible only within this class
    private String password;
    
    // Protected field: accessible within this class, by subclasses, and within the same package
    protected String role;
    
    // Public field: accessible from anywhere
    public String username;
    
    // Final static field: a constant accessible from anywhere, and its value cannot be changed after initialization
    public final static String SYSTEM_NAME = "SecureAppSystem";

    // Constructor to initialize user details
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Public method to display user details (can access private fields within the class)
    public void showUserDetails() {
        System.out.println("\n--- User Details ---");
        System.out.println("Username: " + this.username);
        System.out.println("Role: " + this.role);
        // We can access 'password' here because we are inside the User class
        System.out.println("Password: [HIDDEN FOR SECURITY]"); 
        System.out.println("System Name: " + SYSTEM_NAME);
        System.out.println("---------------------");
    }

    // Public getter for password (if we want to expose it controlled way, though generally avoided for security)
    public String getPassword() {
        return password;
    }
}

// Another class in the same package to demonstrate access
class LoggerApp {
    public static void main(String[] args) {
        System.out.println("Demonstrating field access in Java\n");

        // Accessing a final static field directly using the class name
        System.out.println("Accessing final static SYSTEM_NAME: " + User.SYSTEM_NAME);

        User user1 = new User("admin", "admin123", "Administrator");
        User user2 = new User("guest", "guestpass", "Guest");

        System.out.println("\n--- Accessing fields of user1 from LoggerApp (same package) ---");
        // Public field: Accessible directly
        System.out.println("Username (public): " + user1.username);
        
        // Protected field: Accessible directly from a class in the same package
        System.out.println("Role (protected): " + user1.role);

        // Private field: NOT accessible directly. Will cause a compile-time error if uncommented.
        // System.out.println("Password (private): " + user1.password); // ERROR: password has private access in User
        System.out.println("Password (private): Cannot be accessed directly from outside the User class.");

        // Accessing password via a public getter method (if one exists)
        System.out.println("Password (via getter): " + user1.getPassword());

        // Calling public methods
        user1.showUserDetails();
        user2.showUserDetails();

        // Demonstrating that SYSTEM_NAME is final - cannot be reassigned
        // User.SYSTEM_NAME = "NewSystem"; // ERROR: cannot assign a value to final variable SYSTEM_NAME
        System.out.println("\nAttempting to change SYSTEM_NAME would result in a compile-time error as it is final.");
    }
}

/*
Sample Input/Output:

Demonstrating field access in Java

Accessing final static SYSTEM_NAME: SecureAppSystem

--- Accessing fields of user1 from LoggerApp (same package) ---
Username (public): admin
Role (protected): Administrator
Password (private): Cannot be accessed directly from outside the User class.
Password (via getter): admin123

--- User Details ---
Username: admin
Role: Administrator
Password: [HIDDEN FOR SECURITY]
System Name: SecureAppSystem
---------------------

--- User Details ---
Username: guest
Role: Guest
Password: [HIDDEN FOR SECURITY]
System Name: SecureAppSystem
---------------------

Attempting to change SYSTEM_NAME would result in a compile-time error as it is final.
*/

