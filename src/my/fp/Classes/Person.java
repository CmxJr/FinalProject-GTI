package my.fp.Classes;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String middleName;
    private String surname;
    private String addressLine1;
    private String addressLine2;
    private String county;
    private String eircode;
    private String ppsn;
    private String phoneNumber;
    private String email;
    private LocalDate dateOfBirth;
    
    public Person() {
    }

    // --- Name Metods ---

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    /**
     * Full name method
     */
    public String getFullName() {
        String full = (firstName != null ? firstName : "");
        
        // Adiciona middle name se não for nulo nem vazio
        if (middleName != null && !middleName.trim().isEmpty()) {
            full += " " + middleName;
        }
        
        // Adiciona o apelido
        if (surname != null && !surname.trim().isEmpty()) {
            full += " " + surname;
        }
        
        return full.trim();
    }

    // --- RESTO DOS SETTERS E GETTERS ---
    // (Mantém os teus métodos de Address, County, Eircode, etc. como estavam)
    
    public void setAddressLine1(String addressLine1) { this.addressLine1 = addressLine1; }
    public String getAddressLine1() { return addressLine1; }
    
    public void setAddressLine2(String addressLine2) { this.addressLine2 = addressLine2; }
    public String getAddressLine2() { return addressLine2; }

    public void setCounty(String county) { this.county = county; }
    public String getCounty() { return county; }

    public void setEircode(String eircode) { this.eircode = eircode; }
    public String getEircode() { return eircode; }

    public void setPpsn(String ppsn) { this.ppsn = ppsn; }
    public String getPpsn() { return ppsn; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
}