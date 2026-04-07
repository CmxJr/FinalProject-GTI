package my.fp.Classes;

public class Module {

    private String moduleCode;
    private String moduleName;
    private int courseCode; 
    private int staffId;  
    private int credits;
    
    // Constructor - Fixes the "null null" issue by correctly assigning parameters
    public Module (String code, String name) {
        this.moduleCode = code; 
        this.moduleName = name; 
    }
    
    @Override
    public String toString() {
        // Defines what is displayed in the JComboBox
        String n = (moduleName == null) ? "" : moduleName;
        String c = (moduleCode == null) ? "" : moduleCode;
        return (n + " " + c).trim(); 
    }

    // --- Getters and Setters ---

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}