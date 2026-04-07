package my.fp.Classes;

/**
 * Staff class extending Person to handle database objects
 */
public class Staff extends Person {

    private int staffNumber;
    private String module;

    // Default Constructor
    public Staff() {
        super(); // Calls Person constructor
    }

    // Constructor for ComboBox loading
    public Staff(int staffNumber, String firstName,String middleName, String surname) {
        this.staffNumber = staffNumber;
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setSurname(surname);
    }

    // Full Constructor for detailed search
    public Staff(int staffNumber, String firstName,String middleName, String surname, String module) {
        this.staffNumber = staffNumber;
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setSurname(surname);
        this.module = module;
    }

    /**
     * This is the magic for OOP in Swing:
     * The ComboBox calls this method to display the text.
     */
    @Override
    public String toString() {
        return getFirstName() +" "+ getMiddleName() +" "+ getSurname();
    }

    // --- Getters and Setters (Cleaned up from UnsupportedOperationException) ---

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}