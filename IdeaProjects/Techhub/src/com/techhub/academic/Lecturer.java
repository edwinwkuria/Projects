package com.techhub.academic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.techhub.academic.Unit.*;
import static com.techhub.academic.Department.*;
import static com.techhub.academic.School.computing;
import static com.techhub.academic.School.economics;

public class Lecturer extends Person {
    //Properties
    protected Unit[] units = new Unit[10];
    protected List<Lecturer> lecturers = new ArrayList<>();
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
     * initialize
     */
    static Unit[] leconeunits = {economics101 ,economics201 ,practicaleconomics};
    static Unit[] lectwounits = {practicaleconomics2, practicaleconomics,economics101};
    static Unit[] lecthreeunits = {programming101,programming102,datascience101};
    static Unit[] lecfourunits = {datascience101,programming101};

    public static Lecturer lecone = new Lecturer(1,"John","Doe","1965","UN23456",economics.getId(),economictheory.getId(),leconeunits);
    public static Lecturer lectwo = new Lecturer(2,"Jane","Doe","1985","UN12345",economics.getId(), appliedeconomics.getId(),lectwounits);
    public static Lecturer lecthree = new Lecturer(3,"James","John","1967","UN2346",computing.getId(), programming.getId(),lecthreeunits);
    public static Lecturer lecfour = new Lecturer(4,"Mike","Doe","1945","UN22156",computing.getId(),datascience.getId(),lecfourunits);

    public String getUnitString() {
        StringBuilder string = new StringBuilder();
        for (Unit unit:units){
            string.append(unit.getId());

        }
        return string.toString();
    }
}
