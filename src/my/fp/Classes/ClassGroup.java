package my.fp.Classes;

public class ClassGroup {

    private int classGroupCode;
    private String qqiCourseCode; // String as seen in your database schema
    private String courseName;

    // Default constructor
    public ClassGroup() {
    }

    // Main constructor for the ComboBox
    public ClassGroup(int classGroupCode, String courseName, String qqiCourseCode) {
        this.classGroupCode = classGroupCode;
        this.courseName = courseName;
        this.qqiCourseCode = qqiCourseCode;
    }

    @Override
    public String toString() {
        // This is what the teacher will see in the ComboBox
        return courseName + " (" + qqiCourseCode + ") - Class group: " + classGroupCode;
    }

    // --- Getters and Setters ---

    public int getClassGroupCode() {
        return classGroupCode;
    }

    public void setClassGroupCode(int classGroupCode) {
        this.classGroupCode = classGroupCode;
    }

    public String getQqiCourseCode() {
        return qqiCourseCode;
    }

    public void setQqiCourseCode(String qqiCourseCode) {
        this.qqiCourseCode = qqiCourseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}