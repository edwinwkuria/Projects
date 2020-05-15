package com.techhub.academic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class School {
    //Properties
    protected int id;
    protected String schoolName;

    public List<School> getSchools() {
        return schools;
    }

    public List<School> schools = new ArrayList<>();
    /**
     * Constructor
     */
    public School() {
    }
    public School(int id, String schoolName) {
        this.id = id;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }



    /**
     * To string method
     */
    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    /**
     * initialize
     */
    public static School economics = new School(1, "Economics");
    public static School computing = new School(2,"Computing");
}
