package my.fp.Classes;

public class Student extends Person {

    private int studentId;
    private int classGroupCode; // New field to match the database FK

    // Default constructor
    public Student() {
    }

    // Constructor to help load the ComboBox or simple identification
    public Student(int studentId, String firstName, String middleName, String surname) {
        this.studentId = studentId;
        this.setFirstName(firstName); // From Person class
        this.setMiddleName(middleName);
        this.setSurname(surname);     // From Person class
    }

    // Full constructor (useful when loading complete data from Database)
    public Student(int studentId, String firstName, String surname, int classGroupCode) {
        this.studentId = studentId;
        this.setFirstName(firstName);
        this.setSurname(surname);
        this.classGroupCode = classGroupCode;
    }

    @Override
public String toString() {
    
    String f = (getFirstName() != null) ? getFirstName() : "";
    String m = (getMiddleName() != null) ? getMiddleName() : "";
    String s = (getSurname() != null) ? getSurname() : "";

    return (f + " " + m + " " + s).trim().replaceAll("\\s+", " ");
}

    // --- Getters and Setters ---

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassGroupCode() {
        return classGroupCode;
    }

    public void setClassGroupCode(int classGroupCode) {
        this.classGroupCode = classGroupCode;
    }
}