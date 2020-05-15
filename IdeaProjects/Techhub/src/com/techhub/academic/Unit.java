package com.techhub.academic;

import static com.techhub.academic.Department.*;
import static com.techhub.academic.School.computing;
import static com.techhub.academic.School.economics;

public class Unit {
    //Properties
    private int id;
    private String unitCode, unitTitle;
    private int schoolId;
    private int departmentId;
    /**
     * Constructors
     */
    public Unit(int id, String unitCode, String unitTitle, int schoolId, int  departmentId) {
        this.id = id;
        this.unitCode = unitCode;
        this.unitTitle = unitTitle;
        this.schoolId = schoolId;
        this.departmentId = departmentId;
    }
    /**
     * Accessors and Mutators
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitTitle() {
        return unitTitle;
    }

    public void setUnitTitle(String unitTitle) {
        this.unitTitle = unitTitle;
    }

    public int getSchool() {
        return schoolId;
    }

    public void setSchool(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getDepartment() {
        return departmentId;
    }

    public void setDepartment(int departmentId) {
        this.departmentId = departmentId;
    }
    /**
     * To String
     */
    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", unitCode='" + unitCode + '\'' +
                ", unitTitle='" + unitTitle + '\'' +
                ", school=" + schoolId +
                ", department=" + departmentId +
                '}';
    }
    /**
     * initialize
     */

    public static Unit economics101 = new Unit(1,"EAE101","Economics 101",economics.getId(),economictheory.getId());
    public static Unit economics201 = new Unit(2,"EAE101","Economics 201",economics.getId(),economictheory.getId());
    public static Unit practicaleconomics = new Unit(3,"EAE202","Practical Economics",economics.getId(),appliedeconomics.getId());
    public static Unit practicaleconomics2 = new Unit(4,"EAE202","Advanced Practical Economics",economics.getId(),appliedeconomics.getId());
    public static Unit programming101 = new Unit(5, "CAS101","Introduction to Programming",computing.getId(),programming.getId());
    public static Unit programming102= new Unit(6,"CAS201","Advanced Programming",computing.getId(),programming.getId());
    public static Unit datascience101 = new Unit(7,"CDS101","Analyzing data",computing.getId(),datascience.getId());
    public static Unit datascience201 = new Unit(7,"CDS201","Using R",computing.getId(),datascience.getId());
}
