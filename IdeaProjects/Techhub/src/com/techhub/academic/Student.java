package com.techhub.academic;

import static com.techhub.academic.Department.datascience;
import static com.techhub.academic.Department.economictheory;
import static com.techhub.academic.School.computing;
import static com.techhub.academic.School.economics;

public class Student extends Person{
    //Properties
    private String course ;
    /**
     * Constructors
     */
    public Student(int id, String firstName, String lastName, String dateOfBirth, String registrationNumber, int schoolId, int departmentId, String course) {
        super(id, firstName, lastName, dateOfBirth, registrationNumber, schoolId ,departmentId);
        this.course = course;
    }
    /**
     * Accessors and Mutators
     */
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    /**
     * initialize
     */

    Student studentone = new Student(1,"Doe","Jon","1990","E001",economics.getId(),economictheory.getId(),"Economics");
    Student studenttwo = new Student(2,"Jay","Mike","1995","S001",computing.getId(),datascience.getId(),"ComputerScience");
}
