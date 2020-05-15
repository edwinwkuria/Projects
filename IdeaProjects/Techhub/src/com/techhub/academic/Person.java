package com.techhub.academic;

public class Person {
    //Properties
    protected int Id, schoolId, departmentId;
    protected String FirstName, LastName, DateOfBirth, RegistrationNumber;
    /**
     * Constructor
     */
    public Person(){

    }
    public Person(int id, String firstName, String lastName, String dateOfBirth, String registrationNumber, int schoolId, int departmentId) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        RegistrationNumber = registrationNumber;
        schoolId = schoolId;
        departmentId = departmentId;
    }
    /**
     * Accessors and Mutators
     */
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public int getSchool() {
        return schoolId;
    }

    public void setSchool(int school) {
        this.schoolId = schoolId;
    }

    public int getDepartment() {
        return departmentId;
    }

    public void setDepartment(int departmentId) {
        this.departmentId = departmentId;
    }
}
