package my.fp.Classes;

import java.time.LocalDate;

public class Course {

    private int courseId;           // Database PK (Internal ID)
    private String qqiCourseCode;   // Official QQI Code (e.g., 5M0529)
    private String courseName;
    private int courseLevel;
    private LocalDate startDate;

    // Default Constructor
    public Course() {
    }

    // Full Constructor
    public Course(int courseId, String qqiCourseCode, String courseName, int courseLevel, LocalDate startDate) {
        this.courseId = courseId;
        this.qqiCourseCode = qqiCourseCode;
        this.courseName = courseName;
        this.courseLevel = courseLevel;
        this.startDate = startDate;
    }

    // --- Getters and Setters ---

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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

    public int getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(int courseLevel) {
        this.courseLevel = courseLevel;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        // Helpful for UI display
        return courseName + " [" + qqiCourseCode + "]";
    }
}