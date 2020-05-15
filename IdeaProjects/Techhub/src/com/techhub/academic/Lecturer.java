package com.techhub.academic;

import java.util.Arrays;
import static com.techhub.academic.Unit.*;
import static com.techhub.academic.Department.*;
import static com.techhub.academic.School.computing;
import static com.techhub.academic.School.economics;

public class Lecturer extends Person {
    //Properties
    Unit[] units = new Unit[10];
    /**
     * Constructor
     */
    public Lecturer(){

    }
    public Lecturer(int id, String firstName, String lastName, String dateOfBirth, String registrationNumber, int schoolId, int departmentId, Unit... units) {
        super(id, firstName, lastName, dateOfBirth, registrationNumber, schoolId, departmentId);
        this.units = units;
    }
    /**
     * Accessors and Mutators
     */
    public Unit[] getUnits() {
        return units;
    }

    public void setUnits(Unit[] units) {
        this.units = units;
    }
    /**
     * To String method
     */
    @Override
    public String toString() {
        return "Lecturer{" +
                ", Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", RegistrationNumber='" + RegistrationNumber + '\'' +
                ", school=" + schoolId +
                ", department=" + departmentId +
                "units=" + Arrays.toString(units) +
                '}';
    }
    /**
     * initialize
     */
    Unit[] leconeunits = {economics101 ,economics201 ,practicaleconomics};
    Unit[] lectwounits = {practicaleconomics2, practicaleconomics,economics101};
    Unit[] lecthreeunits = {programming101,programming102,datascience101};
    Unit[] lecfourunits = {datascience101,programming101};

    Lecturer lecone = new Lecturer(1,"John","Doe","1965","UN23456",economics.getId(),economictheory.getId(),leconeunits);
    Lecturer lectwo = new Lecturer(2,"Jane","Doe","1985","UN12345",economics.getId(), appliedeconomics.getId(),lectwounits);
    Lecturer lecthree = new Lecturer(3,"James","John","1967","UN2346",computing.getId(), programming.getId(),lecthreeunits);
    Lecturer lecfour = new Lecturer(4,"Mike","Doe","1945","UN22156",computing.getId(),datascience.getId(),lecfourunits);
}
